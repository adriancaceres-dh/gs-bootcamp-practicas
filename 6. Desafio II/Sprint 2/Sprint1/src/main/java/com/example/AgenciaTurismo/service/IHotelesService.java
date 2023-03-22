package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.request.BookingRequestDto;
import com.example.AgenciaTurismo.dto.response.BookingResponseDto;
import com.example.AgenciaTurismo.dto.response.HotelAvailableDto;

import java.time.LocalDate;
import java.util.List;

public interface IHotelesService {

     List<HotelAvailableDto> searchAll();

     List<HotelAvailableDto> filterHotels(LocalDate dateFrom, LocalDate dateTo, String destination);

     BookingResponseDto bookingResponse(BookingRequestDto bookingRequest);

}
