package com.bootcamp.Ejemplo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class CalculadoraEdadController {

        //forma1
    @GetMapping("/{dia}/{mes}/{anio}")
    public Integer obtenerEdad(@PathVariable Integer dia, @PathVariable Integer mes,@PathVariable Integer anio){

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        Long edad = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);

        return edad.intValue();




    }




}
