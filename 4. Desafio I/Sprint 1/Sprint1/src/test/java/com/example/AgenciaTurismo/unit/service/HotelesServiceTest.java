package com.example.AgenciaTurismo.unit.service;

import com.example.AgenciaTurismo.dto.request.BookingDto;
import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.response.*;
import com.example.AgenciaTurismo.exceptions.SinHotelesException;
import com.example.AgenciaTurismo.exceptions.VuelosException;
import com.example.AgenciaTurismo.repository.IFlightsRepository;
import com.example.AgenciaTurismo.repository.IHotelesRepository;
import com.example.AgenciaTurismo.service.FlightsService;
import com.example.AgenciaTurismo.service.HotelesService;
import com.example.AgenciaTurismo.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class HotelesServiceTest {

    @Mock
    IHotelesRepository hotelesRepository;

    @InjectMocks
    HotelesService hotelesService;

    @Test
    @DisplayName("Se buscan todos los hoteles - SERVICE")
    void searchAll() {
        // arrange
        List<HotelAvailableDto> expected = HotelAvailableDtoFactory.listHotels();

        // act
        Mockito.when(hotelesRepository.findAll()).thenReturn(HotelAvailableDtoFactory.listHotels());
        var result = hotelesService.searchAll();

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("Se filtran los hoteles, con fechas y destino como parámetros - SERVICE")
    public void filterHotels() {
        // arrange
        LocalDate fechaDesde = LocalDate.of(2022,02,10);
        LocalDate fechaHasta = LocalDate.of(2022,03,20);
        String destino = "Puerto Iguazú";
        List<HotelAvailableDto> expected = List.of(HotelAvailableDtoFactory.cataratasHotel());
        System.out.println(expected);

        // act
        Mockito.when(hotelesRepository.findAll())
                .thenReturn(HotelAvailableDtoFactory.listHotels());
        Mockito.when(hotelesRepository.filterHotelsRep(fechaDesde,fechaHasta,destino))
                .thenReturn(List.of(HotelAvailableDtoFactory.cataratasHotel()));


        var result = hotelesService.filterHotels(fechaDesde,fechaHasta,destino);
        System.out.println(result);

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("No hay hoteles disponibles excepción - SERVICE")
    public void filterHotelNotFound(){
        // arrange
        LocalDate desde = LocalDate.of(2022,02,10);
        LocalDate hasta = LocalDate.of(2022,03,19);
        String destino = "Córdoba";

        Mockito.when(hotelesRepository.findAll())
                .thenReturn(List.of());

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .filterHotels(desde,hasta,destino));
    }

    @Test
    @DisplayName("Se reserva el hotel con DTO de booking como parámetro - SERVICE")
    void bookingResponse() {

        //  arrange
        BookingResponseDto expected = HotelResponseDtoFactory.getResponse();
        BookingRequestDto hotel = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto hotelAvailable = HotelAvailableDtoFactory.cataratasHotel();

        // act
        Mockito.when(hotelesRepository.findHotel(hotel.getBooking().getHotelCode())).thenReturn(hotelAvailable);
        var result = hotelesService.bookingResponse(hotel);

        System.out.println(result);
        System.out.println(expected);

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("Excepción por fecha de salida posterior a la de llegada - SERVICE")
    public void filterHotelTestBeforeDate(){
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,02,9);
        String destino = "Puerto Iguazú";

        Mockito.when(hotelesRepository.findAll()).thenReturn(HotelAvailableDtoFactory.listHotels());

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .filterHotels(fechaIda,fechaVuelta,destino));

    }
    @Test
    @DisplayName("Excepción de fecha de ingreso igual a la fecha de salida - SERVICE")
    public void filterHotelTestEqualDate(){
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,02,10);
        String destino = "Puerto Iguazú";

        Mockito.when(hotelesRepository.findAll()).thenReturn(HotelAvailableDtoFactory.listHotels());

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .filterHotels(fechaIda,fechaVuelta,destino));

    }


    @Test
    @DisplayName("Excepción por no disponibilidad en la fecha establecida")
    public void filterFlightTestNonAvailableException(){
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,02,15);
        String destino = "Puerto Iguazú";

        Mockito.when(hotelesRepository.findAll()).thenReturn(HotelAvailableDtoFactory.listHotels());
        Mockito.when(hotelesRepository.filterHotelsRep(fechaIda, fechaVuelta, destino)).thenReturn(List.of());

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .filterHotels(fechaIda,fechaVuelta,destino));

    }

    @Test
    @DisplayName("Excepción cantidad incorrecta de huéspedes habitación SIMPLE - SERVICE")
    public void bookingHotelsTwoPeopleException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationPeopleDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.BristolHotel();


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }
    @Test
    @DisplayName("Excepción cantidad incorrecta de huéspedes habitación DOBLE - SERVICE")
    public void bookingHotelsThreePeopleException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationPeopleDtoThree();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción cantidad incorrecta de huéspedes habitación TRIPLE - SERVICE")
    public void bookingHotelsFourPeopleException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationPeopleDtoFour();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel2();


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción cantidad incorrecta de huéspedes habitación MÚLTIPLE - SERVICE")
    public void bookingHotelsFivePeopleException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationPeopleDtoFive();
        HotelAvailableDto available = HotelAvailableDtoFactory.centralPlaza();


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción cantidad desigual de huéspedes y lista de personas - SERVICE")
    public void bookingHotelsNotEqualPeopleException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setPeopleAmount(2);


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción por falta de personas en el booking - SERVICE")
    public void bookingHotels0PeopleException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setPeopleAmount(0);


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción tipo de habitación incorrecta en booking - SERVICE")
    public void bookingHotelsNotEqualRoomTypeException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setRoomType("Triple");


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción destino incorrecto en el booking - SERVICE")
    public void bookingHotelsNotEqualDestinationException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setDestination("Santa Fe");


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepción por fecha incorrecta en booking - SERVICE")
    public void bookingHotelsNotFindDateException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setDateFrom(LocalDate.of(2022,04,10));
        param.getBooking().setDatoTo(LocalDate.of(2022,05,10));


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepcion por fecha de ingreso posterior a la salida - SERVICE")
    public void bookingHotelsDateToException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setDateFrom(LocalDate.of(2022,04,10));
        param.getBooking().setDatoTo(LocalDate.of(2022,03,10));


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepcion por fecha de ingreso igual a la salida - SERVICE")
    public void bookingHotelsDateFromException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().setDateFrom(LocalDate.of(2022,04,10));
        param.getBooking().setDatoTo(LocalDate.of(2022,04,10));


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepcion por usuario vacio en booking - SERVICE")
    public void bookingHotelsUserEmptyException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.setUserName("");

        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Excepcion por cantidad cuotas incorrectas debit - SERVICE")
    public void bookingHotelsDebitCardException(){
        // arrange

        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().getPaymentMethod().setType("debitcard");

        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        // act && assert
        Assertions.assertThrows(SinHotelesException.class, ()-> hotelesService
                .bookingResponse(param));

    }

    @Test
    @DisplayName("Intereses por coutas en tarjeta de credito - SERVICE")
    public void bookingHotelsCreditCard3Dues(){
        // arrange
        BookingResponseDto expected = HotelResponseDtoFactory.getResponse();
        BookingRequestDto param = HotelReservationReqFactory.getResponseReservationDto();
        HotelAvailableDto available = HotelAvailableDtoFactory.cataratasHotel();
        param.getBooking().getPaymentMethod().setDues(3);
        expected.setTotal(251370.0);
        expected.getStatus().setMessage("Reserva Satisfactoria. Por utilizar TC tiene un recargo del 5%. Su recargo es de: $11970.0");


        Mockito.when(hotelesRepository.findHotel(param.getBooking().getHotelCode())).thenReturn(available);

        var result = hotelesService.bookingResponse(param);
        // act && assert

        Assertions.assertEquals(expected, result);


    }







}