package com.example.AgenciaTurismo.util;

import com.example.AgenciaTurismo.dto.request.BookingDto;
import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.request.PaymentMethodDto;
import com.example.AgenciaTurismo.dto.request.PeopleDto;
import com.example.AgenciaTurismo.dto.response.BookingResDto;
import com.example.AgenciaTurismo.dto.response.BookingResponseDto;
import com.example.AgenciaTurismo.dto.response.StatusCodeDto;

import java.time.LocalDate;
import java.util.List;

public class HotelReservationReqFactory {

    public static BookingRequestDto getResponseReservationDto(){

        return BookingRequestDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .booking(getBookingHotel())
                .build();
    }

    public static BookingDto getBookingHotel(){
        return BookingDto.builder()
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,03,20))
                .hotelCode("CH-0002")
                .destination("Puerto Iguazú")
                .roomType("DOBLE")
                .peopleAmount(1)
                .people(List.of(getPeople()))
                .paymentMethod(getPaymentMethod())
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
                .type("creditcard")
                .number("4545656598987878")
                .build();
    }


    // PEOPLE FAIL TWO

    public static BookingRequestDto getResponseReservationPeopleDto(){

        return BookingRequestDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .booking(getBookingHotelFailPeople())
                .build();
    }
    public static BookingDto getBookingHotelFailPeople(){
        return BookingDto.builder()
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,03,19))
                .hotelCode("HB-0001")
                .destination("Buenos Aires")
                .roomType("Single")
                .peopleAmount(2)
                .people(List.of(getPeople(),getPeopleTwo()))
                .paymentMethod(getPaymentMethod())
                .build();
    }
    public static PeopleDto getPeopleTwo(){
        return PeopleDto.builder()
                .dni("36365939")
                .email("lucianoefesta@hotmail.com")
                .birthDate(LocalDate.of(1992,01,24))
                .lastName("Festa")
                .name("Luciano")
                .build();
    }

    // PEOPLE FAIL THREE

    public static BookingRequestDto getResponseReservationPeopleDtoThree(){

        return BookingRequestDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .booking(getBookingHotelFailPeopleThree())
                .build();
    }
    public static BookingDto getBookingHotelFailPeopleThree(){
        return BookingDto.builder()
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,03,20))
                .hotelCode("CH-0002")
                .destination("Puerto Iguazú")
                .roomType("DOBLE")
                .peopleAmount(3)
                .people(List.of(getPeople(),getPeopleTwo(),getPeopleThree()))
                .paymentMethod(getPaymentMethod())
                .build();
    }
    public static PeopleDto getPeopleThree(){
        return PeopleDto.builder()
                .dni("36365939")
                .email("lucianoefesta@hotmail.com")
                .birthDate(LocalDate.of(1992,01,24))
                .lastName("Festa")
                .name("Luciano")
                .build();
    }

    // PEOPLE FAIL FOUR

    public static BookingRequestDto getResponseReservationPeopleDtoFour(){

        return BookingRequestDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .booking(getBookingHotelFailPeopleFour())
                .build();
    }
    public static BookingDto getBookingHotelFailPeopleFour(){
        return BookingDto.builder()
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,03,23))
                .hotelCode("CH-0003")
                .destination("Puerto Iguazú")
                .roomType("Triple")
                .peopleAmount(4)
                .people(List.of(getPeople(),getPeopleTwo(),getPeopleThree(),getPeopleFour()))
                .paymentMethod(getPaymentMethod())
                .build();
    }
    public static PeopleDto getPeopleFour(){
        return PeopleDto.builder()
                .dni("36365939")
                .email("lucianoefesta@hotmail.com")
                .birthDate(LocalDate.of(1992,01,24))
                .lastName("Festa")
                .name("Luciano")
                .build();
    }

    // PEOPLE FAIL MULTIPLE

    public static BookingRequestDto getResponseReservationPeopleDtoFive(){

        return BookingRequestDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .booking(getBookingHotelFailPeopleFive())
                .build();
    }
    public static BookingDto getBookingHotelFailPeopleFive(){
        return BookingDto.builder()
                .dateFrom(LocalDate.of(2022, 03, 01))
                .datoTo(LocalDate.of(2022,04,17))
                .hotelCode("CP-0004")
                .destination("Medellín")
                .roomType("Múltiple")
                .peopleAmount(5)
                .people(List.of(getPeople(),getPeopleTwo(),getPeopleThree(),getPeopleFour(),getPeopleFive()))
                .paymentMethod(getPaymentMethod())
                .build();
    }
    public static PeopleDto getPeopleFive(){
        return PeopleDto.builder()
                .dni("36365939")
                .email("lucianoefesta@hotmail.com")
                .birthDate(LocalDate.of(1992,01,24))
                .lastName("Festa")
                .name("Luciano")
                .build();
    }


}
