package com.example.ejercicioEdad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



@RestController
public class CalculadorEdadContoller {

    // Forma 1
    @GetMapping ("/{dia}/{mes}/{anio}")
    public Integer obtenerEdad(@PathVariable Integer dia,
                               @PathVariable Integer mes,
                               @PathVariable Integer anio) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio,mes,dia);
        Long respuesta = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        System.out.println("Programa corriendo");
        return respuesta.intValue();
    }

        // Forma 2
    @GetMapping ("/obtenerfecha")
    public Integer obtenerEdadPorUrlGet (@RequestParam Integer dia,
                                @RequestParam Integer mes,
                                @RequestParam Integer anio) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Long respuesta = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        return respuesta.intValue();
    }
}
