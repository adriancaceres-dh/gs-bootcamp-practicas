package com.example.AgenciaTurismo.unit.repository;

import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.repository.FlightsRepository;
import com.example.AgenciaTurismo.util.FlightAvailableDtoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class FligthsRepositoryTest {

    FlightsRepository flightsRepository = new FlightsRepository();

    @Test
    public void findAllTest(){
        // arrange
        List<FlightsAvailableDto> expected = FlightAvailableDtoFactory.listFlights();

        // act
        var result = flightsRepository.findAll();

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void filterFlightRepTest(){
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,02,15);
        String origen = "Buenos Aires";
        String destino = "Puerto Iguazú";
        List<FlightsAvailableDto> expected = List.of(FlightAvailableDtoFactory.getBapi());

        // act
        var result = flightsRepository.filterFlightRep(fechaIda,fechaVuelta,origen,destino);

        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void findFlightTest(){
        // arrange
        String flightNumber = "PIBA-1420";
        String seatType = "Business";
        FlightsAvailableDto expected = FlightAvailableDtoFactory.getPiba();

        // act
        var result = flightsRepository.findFlight(flightNumber,seatType);

        // assert
        Assertions.assertEquals(expected,result);
    }

}
