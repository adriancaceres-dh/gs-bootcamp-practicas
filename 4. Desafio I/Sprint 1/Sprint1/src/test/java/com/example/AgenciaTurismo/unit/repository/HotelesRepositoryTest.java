package com.example.AgenciaTurismo.unit.repository;

import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDto;
import com.example.AgenciaTurismo.repository.HotelesRepository;
import com.example.AgenciaTurismo.util.FlightAvailableDtoFactory;
import com.example.AgenciaTurismo.util.HotelAvailableDtoFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelesRepositoryTest {

    HotelesRepository hotelesRepository = new HotelesRepository();

    @Test
    @DisplayName("se buscan todos los hoteles - REPOSITORY")
    void findAll() {
        // arrange
        List<HotelAvailableDto> expected = List.of(HotelAvailableDtoFactory.cataratasHotel(), HotelAvailableDtoFactory.cataratasHotel2(), HotelAvailableDtoFactory.BristolHotel(), HotelAvailableDtoFactory.centralPlaza());
        // act
        var result = hotelesRepository.findAll();
        // assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Se filtran los hoteles, con fechas, destino y origen como parámetros - REPOSITORY")
    void filterHotelsRep() {
        // arrange
        LocalDate fechaIda = LocalDate.of(2022,02,10);
        LocalDate fechaVuelta = LocalDate.of(2022,03,20);
        String destino = "Puerto Iguazú";
        List<HotelAvailableDto> expected = List.of(HotelAvailableDtoFactory.cataratasHotel(),HotelAvailableDtoFactory.cataratasHotel2());
        // act
        var result = hotelesRepository.filterHotelsRep(fechaIda,fechaVuelta,destino);
        // assert
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("Reserva de hotel con DTO de booking como parámetro - REPOSITORY")
    void findHotel() {

        // arrange
        String hotelCode = "CH-0002";
        HotelAvailableDto expected = HotelAvailableDtoFactory.cataratasHotel();

        // act
        var result = hotelesRepository.findHotel(hotelCode);

        // assert
        Assertions.assertEquals(expected,result);
        
    }
}