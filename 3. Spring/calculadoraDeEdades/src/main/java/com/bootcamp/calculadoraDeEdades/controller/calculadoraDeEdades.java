package com.bootcamp.calculadoraDeEdades.controller;

import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Map;

@RestController
public class calculadoraDeEdades {
    @GetMapping("/{dia}/{mes}/{anio)")
    public Integer obtenerEdad(@PathVariable Integer dia,@PathVariable Integer mes,@PathVariable Integer anio) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaDeNacimiento = LocalDate.of(anio, mes, dia);

        //Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        Long respuesta = ChronoUnit.YEARS.between(fechaDeNacimiento, fechaActual);
        return respuesta.intValue();
    }
}

