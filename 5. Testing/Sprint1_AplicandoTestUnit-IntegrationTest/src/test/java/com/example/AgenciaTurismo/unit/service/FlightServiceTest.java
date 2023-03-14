package com.example.AgenciaTurismo.unit.service;

import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.response.FlightResponseDto;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.repository.IFlightsRepository;
import com.example.AgenciaTurismo.service.FlightsService;
import com.example.AgenciaTurismo.service.IFlightsService;
import com.example.AgenciaTurismo.util.FlightAvailableDtoFactory;
import com.example.AgenciaTurismo.util.FlightReservationReqFactory;
import com.example.AgenciaTurismo.util.FlightResponseDtoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class FlightServiceTest {

    @Mock
    IFlightsRepository flightsRepository;

    @InjectMocks
    FlightsService flightsService;

    @Test
    public void searchAllTest(){
        // arrange
        List<FlightsAvailableDto> expected = FlightAvailableDtoFactory.listFlights();

        // act
        Mockito.when(flightsRepository.findAll()).thenReturn(FlightAvailableDtoFactory.listFlights());
        var result = flightsService.searchAll();

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void filterFlightsTest(){
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,02,15);
        String origen = "Buenos Aires";
        String destino = "Puerto Iguazú";
        List<FlightsAvailableDto> expected = List.of(FlightAvailableDtoFactory.getBapi());

        // act
        Mockito.when(flightsRepository.filterFlightRep(fechaIda,fechaVuelta,origen,destino))
                .thenReturn(List.of(FlightAvailableDtoFactory.getBapi()));

        var result = flightsService.filterFlights(fechaIda,fechaVuelta,origen,destino);

        // assert
        Assertions.assertEquals(expected,result);

    }

    @Test
    public void filterFlightTestException(){
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,02,15);
        String origen = "Buenos Aires";
        String destino = "Córdoba";

        // act && assert
        Assertions.assertThrows(RuntimeException.class, ()-> flightsService
                .filterFlights(fechaIda,fechaVuelta,origen,destino));

    }

    @Test
    public void flightReservationResponseTest(){
        //  arrange
        FlightResponseDto expected = FlightResponseDtoFactory.getResponse();
        FlightReservationReqDto flight = FlightReservationReqFactory.getFlightReservationDto();
        FlightsAvailableDto flightAvalilable = FlightAvailableDtoFactory.getBapi();

        // act
        Mockito.when(flightsRepository.findFlight(flight.getFlightReservation().getFlightNumber(),
                flight.getFlightReservation().getSeatType())).thenReturn(flightAvalilable);
        var result = flightsService.flightReservationResponse(flight);

        // assert
        Assertions.assertEquals(expected,result);


    }


}
