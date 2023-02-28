package com.clase2.Spring.clase2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@RestController
public class CalculoEdad {

    @GetMapping("/{dia}/{mes}/{anio}")
    public long calculoDeEdad(@PathVariable String dia, @PathVariable String mes, @PathVariable String anio){
        String fechaIngresada = dia + "/" + mes + "/" + anio;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaEspecifica = LocalDate.parse(fechaIngresada, formatter);

        LocalDate fechaActual = LocalDate.now();

        long diferenciaAnios = ChronoUnit.YEARS.between(fechaEspecifica, fechaActual);
        return diferenciaAnios;
    }
}
