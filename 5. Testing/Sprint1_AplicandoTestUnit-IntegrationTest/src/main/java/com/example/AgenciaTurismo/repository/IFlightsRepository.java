package com.example.AgenciaTurismo.repository;

import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.models.FlightModel;

import java.time.LocalDate;
import java.util.List;

public interface IFlightsRepository{

    List<FlightModel> dataBase();

    List<FlightsAvailableDto> findAll();

    List<FlightsAvailableDto> filterFlightRep(LocalDate fechaIda, LocalDate fechaVuelta, String origen, String destino);

    FlightsAvailableDto findFlight(String flightNumber, String seatType);

}
