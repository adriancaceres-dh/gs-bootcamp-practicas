package com.bootcamp.demo.controller;

import com.bootcamp.demo.dto.HabitacionDto;
import com.bootcamp.demo.dto.HabitacionDtoMetros;
import com.bootcamp.demo.dto.PropiedadDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CalculadoraMetrosCuadradosController {

    @PostMapping("/totalmetroscuadrados")
    public ResponseEntity<String> totalMetrosCuadrados(@RequestBody PropiedadDto propiedadDto) {
        // los calculos van en la capa de servicios
        Double mtsCuadrados = propiedadDto.getHabitaciones().stream()
                .mapToDouble(p -> p.getAncho()*p.getLargo()).sum();
        Double valorPropiedad = mtsCuadrados * 800.0;
        List<HabitacionDtoMetros> habitacionDtoMetros =
                propiedadDto.getHabitaciones().stream()
                        .map(h -> new HabitacionDtoMetros(h,h.getAncho()*h.getLargo()))
                        .collect(Collectors.toList());
        HabitacionDtoMetros habitacionDtoMasGrande =
                habitacionDtoMetros.stream().max(Comparator.comparing(HabitacionDtoMetros::getMetrosCuadrados))
                        .orElse(null);
        return new ResponseEntity<>("Cantidad de metros cuadrados " + mtsCuadrados
                + " Valor propiedad " + valorPropiedad
                + " Maximo metros cuadrados " + habitacionDtoMasGrande
                + " Habitaciones en metros " + habitacionDtoMetros
                , HttpStatus.OK);
    }

}
