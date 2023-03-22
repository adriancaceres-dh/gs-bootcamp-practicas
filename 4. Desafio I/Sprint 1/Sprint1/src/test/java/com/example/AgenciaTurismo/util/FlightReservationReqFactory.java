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

    public static FlightReservationReqDto getFlightReservationDtoDebit(){
        return FlightReservationReqDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .flightReservation(getFlightReservation())
                .paymentMethodDto(getPaymentMethodDebit())
                .build();
    }

    public static FlightReservationReqDto getFlightReservationDtoCredit3(){
        return FlightReservationReqDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .flightReservation(getFlightReservation())
                .paymentMethodDto(getPaymentMethodCredit3())
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
                .dues(4)
                .type("creditcard")
                .number("4545656598987878")
                .build();
    }

    public static PaymentMethodDto getPaymentMethodDebit(){
        return PaymentMethodDto.builder()
                .dues(1)
                .type("debitcard")
                .number("4545656598987878")
                .build();
    }

    public static PaymentMethodDto getPaymentMethodCredit3(){
        return PaymentMethodDto.builder()
                .dues(3)
                .type("creditcard")
                .number("4545656598987878")
                .build();
    }

    public static FlightReservationResDto getFlightReservationWrongPeople(){
        return FlightReservationResDto.builder()
                .flightNumber("BAPI-1235")
                .seats(1)
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,02,15))
                .destination("Puerto Iguazú")
                .origin("Buenos Aires")
                .people(List.of())
                .seatType("Economy")
                .build();
    }

    public static FlightReservationReqDto getReservationWrong() {
        return FlightReservationReqDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .flightReservation(getFlightReservationWrongPeople())
                .paymentMethodDto(getPaymentMethod())
                .build();
    }

    public static FlightReservationReqDto getFlightReservationDtoWrong(){
        return FlightReservationReqDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .flightReservation(getFlightReservationWrong())
                .paymentMethodDto(getPaymentMethod())
                .build();
    }

    public static FlightReservationResDto getFlightReservationWrong(){
        return FlightReservationResDto.builder()
                .flightNumber("BAPI-1235")
                .seats(0)
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,02,15))
                .destination("Puerto Iguazú")
                .origin("Buenos Aires")
                .people(List.of(getPeople()))
                .seatType("Economy")
                .build();
    }
}
