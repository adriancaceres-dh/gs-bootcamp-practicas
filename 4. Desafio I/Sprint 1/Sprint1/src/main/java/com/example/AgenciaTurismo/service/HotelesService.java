package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.ErrorMessageDTO;
import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.response.BookingResDto;
import com.example.AgenciaTurismo.dto.response.BookingResponseDto;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDto;
import com.example.AgenciaTurismo.dto.response.StatusCodeDto;
import com.example.AgenciaTurismo.exceptions.FechasException;
import com.example.AgenciaTurismo.exceptions.SinHotelesException;
import com.example.AgenciaTurismo.repository.IHotelesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class HotelesService implements IHotelesService {
    @Autowired
    IHotelesRepository hotelesRepository;


    public List<HotelAvailableDto> searchAll(){

        return hotelesRepository.findAll();
    }


    public List<HotelAvailableDto> filterHotels(LocalDate dateFrom, LocalDate dateTo, String destination) {

        List<HotelAvailableDto> allHotels = hotelesRepository.findAll();

        List<HotelAvailableDto> destinationStatus = allHotels.stream().filter(hotel -> Objects.equals(hotel.getLugar(), destination)).collect(Collectors.toList());
        List<HotelAvailableDto> dateFromStatus = destinationStatus.stream().filter(hotel -> hotel.getDisponibleDesde().isAfter(dateFrom)).collect(Collectors.toList());
        List<HotelAvailableDto> dateToStatus = destinationStatus.stream().filter(hotel -> hotel.getDisponibleHasta().isBefore(dateTo)).collect(Collectors.toList());
        List<HotelAvailableDto> dateEqualFromStatus = destinationStatus.stream().filter(hotel -> hotel.getDisponibleDesde().equals(dateFrom)).collect(Collectors.toList());
        List<HotelAvailableDto> dateEqualToStatus = destinationStatus.stream().filter(hotel -> hotel.getDisponibleHasta().equals(dateTo)).collect(Collectors.toList());



        // VALIDACION POR DESTINO
        if (destinationStatus.isEmpty()){
            throw new SinHotelesException("El destino elegido no existe.");
        }

        //VALIDACION FECHA ENTRADA MENOR A SALIDA
        if(dateFrom.isAfter(dateTo)){
            throw new SinHotelesException("La fecha de ida debe ser menor a la de vuelta.");
        }

        //VALIDACION FECHA SALIDA MAYOR A ENTRADA
        if(dateFrom.isEqual(dateTo)){
            throw new SinHotelesException("La fecha de vuelta debe ser mayor a la de ida");
        }

        List<HotelAvailableDto> hotelAvailable = hotelesRepository.filterHotelsRep(dateFrom, dateTo, destination);

        if(hotelAvailable.isEmpty()){
            throw new SinHotelesException("No se encontraron hoteles disponibles en esta fecha.");
        }

        return hotelAvailable;
    }


    public BookingResponseDto bookingResponse(BookingRequestDto bookingRequest){

        BookingResponseDto response = new BookingResponseDto();

        //NUEVA RESPONSE RESERVA - DATOS SIN MEDIOS DE PAGO
        BookingResDto booking = new BookingResDto();

        //BUSQUEDA DEL HOTEL POR CODIGO PASADO EN EL REQUEST.
        HotelAvailableDto bookedHotel = hotelesRepository.findHotel(bookingRequest.getBooking().getHotelCode());

        String roomAvailable = bookedHotel.getTipoHabitacion();
        String roomSelect = bookingRequest.getBooking().getRoomType().toUpperCase();

        int peopleAmount = bookingRequest.getBooking().getPeopleAmount();
        int people = bookingRequest.getBooking().getPeople().size();

        boolean destination = bookedHotel.getLugar().equalsIgnoreCase(bookingRequest.getBooking().getDestination());

        boolean dateFrom = bookedHotel.getDisponibleDesde().isAfter(bookingRequest.getBooking().getDateFrom());
        boolean dateTo = bookedHotel.getDisponibleHasta().isBefore(bookingRequest.getBooking().getDatoTo());

        boolean dateEqualFrom = bookedHotel.getDisponibleDesde().isEqual(bookingRequest.getBooking().getDateFrom());
        boolean dateEqualTo = bookedHotel.getDisponibleHasta().isEqual(bookingRequest.getBooking().getDatoTo());

        LocalDate dateFromReq = bookingRequest.getBooking().getDateFrom();
        LocalDate dateToReq = bookingRequest.getBooking().getDatoTo();


        if (!bookingRequest.getUserName().isEmpty()) {
            //VERIFICAMOS FECHA DE ENTRADA MENOR A SALIDA
            if (!dateFromReq.isAfter(dateToReq)) {

                //VERIFICAMOS FECHA DE SALIDA MENOR A ENTRADA
                if (!dateFromReq.isEqual(dateToReq)) {

                    //VERIFICAMOS DISPONIBILIDAD EN ESAS FECHAS
                    if (!dateFrom && !dateTo || dateEqualFrom && dateEqualTo) {

                        //VERIFICAMOS DE QUE EL DESTINO SOLICITADO ESTÉ EN EL MISMO LUGAR QUE EL HOTEL
                        if (destination) {

                            //SI EL HOTEL POSEE EL TIPO DE HABITACIÓN SEGUIMOS
                            if (roomSelect.equalsIgnoreCase(roomAvailable)) {

                                if (peopleAmount != 0) {
                                    // SI ES MÁS DE UNA PERSONA, SEGUIMOS

                                    switch (roomSelect) {
                                        //INICIAMOS SWTICH PARA LOS 4 TIPO DE HABITACIONES EXISTENTES ENTRE TODOS LOS HOTELES
                                        case "SINGLE": {
                                            if (peopleAmount > 1) {
                                                throw new SinHotelesException("No puede ingresar " + peopleAmount + " personas en una habitación tipo Single.");
                                            }
                                            break;
                                        }
                                        case "DOBLE": {
                                            if (peopleAmount > 2) {
                                                throw new SinHotelesException("No puede ingresar " + peopleAmount + " personas en una habitación tipo Doble.");
                                            }
                                            break;
                                        }
                                        case "TRIPLE": {
                                            if (peopleAmount > 3) {
                                                throw new SinHotelesException("No puede ingresar " + peopleAmount + " personas en una habitación tipo Triple.");
                                            }
                                            break;
                                        }
                                        case "MÚLTIPLE": {
                                            if (peopleAmount > 4) {
                                                throw new SinHotelesException("El tipo de habitación seleccionada no coincide con la cantidad de personas que se alojarán en ella. " +
                                                        "No puede ingresar " + peopleAmount + " personas en una habitación tipo Múltiple (máximo 4).");
                                            }
                                            break;
                                        }
                                    }

                                    if (peopleAmount == people) {
                                        // SI CONICIDE LA CANTIDAD DE HUESPEDES CON LA CANTIDAD DE PERSONAS INGRESADA

                                        booking.setHotelCode(bookingRequest.getBooking().getHotelCode());
                                        booking.setPeopleAmount(bookingRequest.getBooking().getPeopleAmount());
                                        booking.setRoomType(bookingRequest.getBooking().getRoomType().toUpperCase());
                                        booking.setPeople(bookingRequest.getBooking().getPeople());
                                        booking.setDateFrom(bookingRequest.getBooking().getDateFrom());
                                        booking.setDatoTo(bookingRequest.getBooking().getDatoTo());
                                        booking.setDestination(bookedHotel.getLugar());

                                        // EN CASO QUE LA CANTIDAD DE PERSONAS NO COINCIDA CON EL DETALLE DE LAS PERSONAS.
                                    } else {
                                        throw new SinHotelesException("El número de huéspedes no coincide con la cantidad de personas ingresada.");

                                    }
                                    // EN CASO DE QUE SE COLOQUE 0 EN LAS PERSONAS TOTALES
                                } else {
                                    throw new SinHotelesException("No puede colocar 0 en las personas que ingresarán a la habitación.");

                                }
                                // EN CASO DE QUE LA HABITACION SOLICITADA NO ESTE EN EL HOTEL, LE OFRECEMOS LA QUE POSEEMOS EN EL MISMO
                            } else {
                                throw new SinHotelesException("No poseemos este tipo de habitación en el hotel seleccionado. Le podemos ofrecer una habitación "
                                        + roomAvailable + ".");

                            }
                            // EN CASO DE QUE EL DESTINO SOLICITADO SEA DISTINTO AL DEL HOTEL BUSCADO
                        } else {
                            throw new SinHotelesException("El Hotel '" + bookedHotel.getNombre() + "' se encuentra en " + bookedHotel.getLugar() + ", no en "
                                    + bookingRequest.getBooking().getDestination() + ". El destino elegido no existe");

                        }
                    } else {
                        throw new SinHotelesException("El Hotel '" + bookedHotel.getNombre() + "' se encuentra dispobile desde el " + bookedHotel.getDisponibleDesde() + " hasta el "
                                + bookedHotel.getDisponibleHasta());

                    }
                } else {
                    throw new SinHotelesException("La fecha de salida debe ser mayor a la de entrada");
                }
            } else {
                throw new SinHotelesException("La fecha de entrada debe ser menor a la de salida");
            }
        } else {
            throw new SinHotelesException("Debe ingresar un usuario.");

        }


        double bookingDays = bookingRequest.getBooking().getDatoTo().getDayOfYear() - bookingRequest.getBooking().getDateFrom().getDayOfYear();
        //CALCULO DE CANTIDAD DE DIAS DE DIF

        if (bookingRequest.getBooking().getPaymentMethod().getType().equalsIgnoreCase("debitcard")){

            bookingDays = bookingRequest.getBooking().getDatoTo().getDayOfYear() - bookingRequest.getBooking().getDateFrom().getDayOfYear();

            if(bookingRequest.getBooking().getPaymentMethod().getDues() > 1){
                throw new SinHotelesException("El método de pago es Débito, solo puede elegir 1 cuota.");
            }
        }

        String mensaje = "Reserva Satisfactoria";

        Double total = bookedHotel.getPrecioNoche() * bookingDays;

        if (bookingRequest.getBooking().getPaymentMethod().getType().equalsIgnoreCase("creditcard")){
            int cuotas = bookingRequest.getBooking().getPaymentMethod().getDues();
            if (cuotas <= 3){
                mensaje = "Reserva Satisfactoria. Por utilizar TC tiene un recargo del 5%. Su recargo es de: $" + total * 0.05;

                total *= 1.05;

            } else{
                mensaje = "Reserva Satisfactoria. Por utilizar TC tiene un recargo del 10%. Su recargo es de: $" + total * 0.10;

                total *= 1.10;

            }
        }


        //SETEO DEL RESPONSE
        response.setBooking(booking);
        response.setUserName(bookingRequest.getUserName());
        response.setStatus(new StatusCodeDto(200,mensaje));
        response.setTotal(total);


        return response;
    }
}
