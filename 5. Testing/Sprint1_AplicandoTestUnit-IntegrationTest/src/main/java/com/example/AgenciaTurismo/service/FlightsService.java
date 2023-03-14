package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.response.*;
import com.example.AgenciaTurismo.exceptions.SinHotelesException;
import com.example.AgenciaTurismo.exceptions.VuelosException;
import com.example.AgenciaTurismo.models.FlightModel;
import com.example.AgenciaTurismo.repository.FlightsRepository;
import com.example.AgenciaTurismo.repository.IFlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightsService implements IFlightsService {

    @Autowired
    IFlightsRepository flightsRepository;

    public List<FlightsAvailableDto> searchAll(){

        return flightsRepository.findAll();
    }

    public List<FlightsAvailableDto> filterFlights(LocalDate fechaIda, LocalDate fechaVuelta, String origen, String destino){

        List<FlightsAvailableDto> flightsAvailable = flightsRepository.filterFlightRep(fechaIda, fechaVuelta, origen, destino);

        if(flightsAvailable.isEmpty()){
            throw new RuntimeException("No se encontraron vuelos disponibles en este periodo de tiempo y en el destino indicado :(.");
        }

        return flightsAvailable;
    }

    public FlightResponseDto flightReservationResponse(FlightReservationReqDto flightReservationReqDto){
        FlightResponseDto response = new FlightResponseDto();

        //BUSQUEDA DEL VUELO POR CODIGO PASADO EN EL REQUEST.
        FlightsAvailableDto bookedFlight = flightsRepository.findFlight(flightReservationReqDto.getFlightReservation().getFlightNumber(),
                                                                        flightReservationReqDto.getFlightReservation().getSeatType());

        //NUEVA RESPONSE RESERVA - DATOS SIN MEDIOS DE PAGO
        FlightReservationResDto booking = new FlightReservationResDto();

        //  CANTIDAD DE PERSONAS
        int peopleAmount = flightReservationReqDto.getFlightReservation().getSeats();
        // CANTIDAD DE PERSONAS CON SU DETALLE
        int people = flightReservationReqDto.getFlightReservation().getPeople().size();

        //IGUALDAD DE DESTINO
        boolean destination = flightReservationReqDto.getFlightReservation().getDestination().equalsIgnoreCase(bookedFlight.getDestino());
        //IGUALDAD ORIGEN
        boolean origin = flightReservationReqDto.getFlightReservation().getOrigin().equalsIgnoreCase(bookedFlight.getOrigen());

        // IGUAL A LA FECHA DISPONIBLE
        boolean dateFromEqual = bookedFlight.getFechaIda().isEqual(flightReservationReqDto.getFlightReservation().getDateFrom());
        boolean dateToEqual = bookedFlight.getFechaVuelta().isEqual(flightReservationReqDto.getFlightReservation().getDatoTo());

        // TIPO DE ASIENTO
        String seatTypeAvailable = bookedFlight.getTipoAsiento().toUpperCase();
        String seatTypeSelect = flightReservationReqDto.getFlightReservation().getSeatType().toUpperCase();

        if (!flightReservationReqDto.getUserName().isEmpty()){
        if (dateFromEqual && dateToEqual) {
            if (destination && origin){
                if (seatTypeSelect.equalsIgnoreCase(seatTypeAvailable)){
                    if (peopleAmount != 0 ) {
                        if(peopleAmount == people){

                            booking.setFlightNumber(flightReservationReqDto.getFlightReservation().getFlightNumber());
                            booking.setOrigin(flightReservationReqDto.getFlightReservation().getOrigin());
                            booking.setSeats(flightReservationReqDto.getFlightReservation().getSeats());
                            booking.setPeople(flightReservationReqDto.getFlightReservation().getPeople());
                            booking.setDateFrom(flightReservationReqDto.getFlightReservation().getDateFrom());
                            booking.setDatoTo(flightReservationReqDto.getFlightReservation().getDatoTo());
                            booking.setDestination(bookedFlight.getDestino());
                            booking.setSeatType(flightReservationReqDto.getFlightReservation().getSeatType());

                }else{
                    throw new VuelosException("La cantidad de pasajeros no coincide con la cantidad de personas ingresada.");}
                } else {
                    throw new VuelosException("Número de personas inválido.");}
                } else {
                    throw new VuelosException("No poseemos este tipo de asiento en el vuelo seleccionado. Le podemos ofrecer uno estilo "
                            + seatTypeAvailable + ".");}
                } else {
                throw new VuelosException("El vuelo '" + bookedFlight.getNroVuelo() + "' se dirige desde "+ bookedFlight.getOrigen()+ " hacia " + bookedFlight.getDestino() + ", no desde " + flightReservationReqDto.getFlightReservation().getOrigin() + " hacia "
                        + flightReservationReqDto.getFlightReservation().getDestination());}
                } else {
                 throw new VuelosException("El vuelo número '" + bookedFlight.getNroVuelo()+ "' se encuentra dispobile desde el " + bookedFlight.getFechaIda() + " hasta el "
                    + bookedFlight.getFechaVuelta());}
                } else {
                    throw new VuelosException("Debe ingresar un nombre de usuario.");
                }


        //CALCULO DEL TOTAL DE LA COMPRA
        Double total = bookedFlight.getPrecioPersona() * flightReservationReqDto.getFlightReservation().getSeats();

        //SETEO DEL RESPONSE
        response.setFlightReservation(booking);
        response.setUserName(flightReservationReqDto.getUserName());
        response.setStatus(new StatusCodeDto(200,"Reserva Satisfactoria"));
        response.setTotal(total);


        return response;
    }

}
