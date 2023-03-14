package com.example.AgenciaTurismo.util;

import com.example.AgenciaTurismo.dto.request.PeopleDto;
import com.example.AgenciaTurismo.dto.response.FlightReservationResDto;
import com.example.AgenciaTurismo.dto.response.FlightResponseDto;
import com.example.AgenciaTurismo.dto.response.StatusCodeDto;

import java.time.LocalDate;
import java.util.List;

public class FlightResponseDtoFactory {

    public static FlightResponseDto getResponse(){

        return FlightResponseDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .total(6500.0)
                .status(getStatus())
                .flightReservation(getFlightReservation())
                .build();
    }

    public static FlightReservationResDto getFlightReservation(){
        return FlightReservationResDto.builder()
                .flightNumber("BAPI-1235")
                .seats(1)
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,02,15))
                .destination("Puerto Iguazú")
                .origin("Buenos Aires")
                .people(List.of(getPeople()))
                .seatType("Economy")
                .build();
    }

    public static PeopleDto getPeople(){
        return PeopleDto.builder()
                .dni("36365939")
                .email("lucianoefesta@hotmail.com")
                .birthDate(LocalDate.of(1992,01,24))
                .lastName("Festa")
                .name("Luciano")
                .build();
    }

    public static StatusCodeDto getStatus(){
        return StatusCodeDto.builder()
                .code(200)
                .message("Reserva Satisfactoria")
                .build();
    }

}
