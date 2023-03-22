package com.example.AgenciaTurismo.controller;

import com.example.AgenciaTurismo.dto.request.FlightReservationReqDto;
import com.example.AgenciaTurismo.dto.response.FlightResponseDto;
import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.example.AgenciaTurismo.service.FlightsService;
import com.example.AgenciaTurismo.service.IFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@Validated
@RequestMapping("/api/v1/")
public class FlightsController {
    @Autowired
    IFlightsService flightsService;

    @GetMapping("/flights")
    public List<FlightsAvailableDto> searchAllFlights(){
        return flightsService.searchAll();
    }

    @GetMapping("/flight")
    public List<FlightsAvailableDto> filterFlights(@RequestParam("dateFrom") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fechaIda,
                                                @RequestParam("dateTo") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fechaVuelta,
                                                @RequestParam("origin") String origen,
                                                @RequestParam("destination") String destino){

        return flightsService.filterFlights(fechaIda, fechaVuelta, origen, destino);
    }

    @PostMapping("/flight-reservation")
    public FlightResponseDto booking(@RequestBody @Valid FlightReservationReqDto flightReservationReqDto){

        return flightsService.flightReservationResponse(flightReservationReqDto);
    }

}
