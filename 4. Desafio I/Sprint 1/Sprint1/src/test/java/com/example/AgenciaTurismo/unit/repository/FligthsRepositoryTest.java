package com.example.AgenciaTurismo.unit.repository;

import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.repository.FlightsRepository;
import com.example.AgenciaTurismo.util.FlightAvailableDtoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class FligthsRepositoryTest {

    FlightsRepository flightsRepository = new FlightsRepository();

    @Test
    @DisplayName("se buscan todos los vuelos - REPOSITORY")
    public void findAllTest(){
        // arrange
        List<FlightsAvailableDto> expected = FlightAvailableDtoFactory.listFlights();

        // act
        var result = flightsRepository.findAll();

        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Se filtran los vuelos, con fechas, destino y origen como parámetros - REPOSITORY")
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
    @DisplayName("Reserva de vuelo con DTO de booking como parámetro - REPOSITORY")
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
