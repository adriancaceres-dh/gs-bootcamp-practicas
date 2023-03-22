package com.example.AgenciaTurismo.util;

import com.example.AgenciaTurismo.dto.request.BookingDto;
import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.request.PeopleDto;
import com.example.AgenciaTurismo.dto.response.*;

import java.time.LocalDate;
import java.util.List;

public class HotelResponseDtoFactory {

    public static BookingResponseDto getResponse(){

        return BookingResponseDto.builder()
                .userName("lucianoefesta@hotmail.com")
                .total(263340.0)
                .status(getStatus())
                .booking(getBookingHotel())
                .build();
    }

    public static BookingResDto getBookingHotel(){
        return BookingResDto.builder()
                .dateFrom(LocalDate.of(2022, 02, 10))
                .datoTo(LocalDate.of(2022,03,20))
                .hotelCode("CH-0002")
                .destination("Puerto Iguazú")
                .roomType("DOBLE")
                .peopleAmount(1)
                .people(List.of(getPeople()))
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
                .message("Reserva Satisfactoria. Por utilizar TC tiene un recargo del 10%. Su recargo es de: $23940.0")
                .build();
    }


}
