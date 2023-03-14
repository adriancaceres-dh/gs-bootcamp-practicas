package com.example.AgenciaTurismo.service;

import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.response.FlightResponseDto;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;

import java.time.LocalDate;
import java.util.List;

public interface IFlightsService {

    List<FlightsAvailableDto> searchAll();


    List<FlightsAvailableDto> filterFlights(LocalDate fechaIda, LocalDate fechaVuelta, String origen, String destino);


    FlightResponseDto flightReservationResponse(FlightReservationReqDto flightReservationReqDto);

}
