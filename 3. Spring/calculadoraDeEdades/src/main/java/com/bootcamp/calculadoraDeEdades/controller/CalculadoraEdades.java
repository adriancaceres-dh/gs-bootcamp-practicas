package com.bootcamp.calculadoraDeEdades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;


@RestController
public class CalculadoraEdades {
    @GetMapping("/{dia}/{mes}/{anio}")
    public String edad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        Period diferencia = Period.between(fechaIngresada, fechaActual);
        //System.out.println(diferencia);

        return "La edad de la persona es: " + diferencia.getYears() + " años."
                + " Edad detallada: " + diferencia.getDays() + " días, " + diferencia.getMonths() + " Meses, " + diferencia.getYears() + " años.";
    }
}
