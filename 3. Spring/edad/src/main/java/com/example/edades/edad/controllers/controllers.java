package com.example.edades.edad.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class controllers {
    @GetMapping("/fechadenacimiento/{dia}/{mes}/{anio}")
    public int CalcularEdad(@PathVariable Integer dia,
                            @PathVariable Integer mes,
                            @PathVariable Integer anio){

       LocalDate fechaActual = LocalDate.now();
       LocalDate fechaNacimiento = LocalDate.of(anio,mes,dia);

       Long respuesta = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);

         return respuesta.intValue();

    }
}
