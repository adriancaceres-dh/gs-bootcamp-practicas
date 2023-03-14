package com.example.AgenciaTurismo.util;

import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.request.PaymentMethodDto;
import com.example.AgenciaTurismo.dto.request.PeopleDto;
import com.example.AgenciaTurismo.dto.response.FlightReservationResDto;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.util.List;

public class FlightReservationReqFactory {

    public static FlightReservationReqDto getFlightReservationDto(){
        return FlightReservationReqDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .flightReservation(getFlightReservation())
                .paymentMethodDto(getPaymentMethod())
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

    public static PaymentMethodDto getPaymentMethod(){
        return PaymentMethodDto.builder()
                .dues(6)
                .type("Credit Card")
                .number("4545 6565 9898 7878")
                .build();
    }

}
