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
                .total(7150.000000000001)
                .status(getStatus())
                .flightReservation(getFlightReservation())
                .build();
    }

    public static FlightResponseDto getResponseDebit(){

        return FlightResponseDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .total(6500.0)
                .status(getStatus())
                .flightReservation(getFlightReservation())
                .build();
    }

    public static FlightResponseDto getResponseCredit3(){

        return FlightResponseDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .total(6825.0)
                .status(getStatusCredit3())
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
                .message("Reserva Satisfactoria. Por utilizar TC tiene un recargo del 10%. Su recargo es de: $650.0")
                .build();
    }

    public static StatusCodeDto getStatusDebit(){
        return StatusCodeDto.builder()
                .code(200)
                .message("Reserva Satisfactoria.")
                .build();
    }

    public static StatusCodeDto getStatusCredit3(){
        return StatusCodeDto.builder()
                .code(200)
                .message("Reserva Satisfactoria. Por utilizar TC tiene un recargo del 5%. Su recargo es de: $325.0")
                .build();
    }

}
