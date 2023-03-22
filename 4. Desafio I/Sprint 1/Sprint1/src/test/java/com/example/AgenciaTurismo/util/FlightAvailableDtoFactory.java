package com.example.AgenciaTurismo.util;

import com.example.AgenciaTurismo.dto.response.FlightsAvailableDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlightAvailableDtoFactory {

    public static FlightsAvailableDto getBapi(){
        return FlightsAvailableDto.builder()
                .nroVuelo("BAPI-1235")
                .origen("Buenos Aires")
                .destino("Puerto Iguazú")
                .tipoAsiento("Economy")
                .precioPersona(6500.0)
                .fechaIda(LocalDate.of(2022,02,10))
                .fechaVuelta(LocalDate.of(2022,02,15))
                .build();
    }

    public static FlightsAvailableDto getPiba(){
        return FlightsAvailableDto.builder()
                .nroVuelo("PIBA-1420")
                .origen("Puerto Iguazú")
                .destino("Bogotá")
                .tipoAsiento("Business")
                .precioPersona(43200.0)
                .fechaIda(LocalDate.of(2022,02,10))
                .fechaVuelta(LocalDate.of(2022,02,20))
                .build();
    }

    public static List<FlightsAvailableDto> listFlights(){
        List<FlightsAvailableDto> list = new ArrayList<>();
        list.add(getBapi());
        list.add(getPiba());

        return list;
    }
}
