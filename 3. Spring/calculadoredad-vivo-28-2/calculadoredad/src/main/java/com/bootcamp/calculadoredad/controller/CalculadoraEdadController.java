package com.bootcamp.calculadoredad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RestController
public class CalculadoraEdadController implements ICalculadorEdadController{

    // Forma 1
    @GetMapping("/{dia}/{mes}/{anio}")
    public Integer obtenerEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {
        return calcularFecha(dia,mes,anio); //   respuesta.intValue();
    }

    // Forma 2
    @GetMapping("/obtenerfecha")
    public Integer obtenerEdadPorUrlGet(@RequestParam Integer dia, @RequestParam Integer mes, @RequestParam Integer anio) {
        return calcularFecha(dia,mes,anio);
    }

    private Integer calcularFecha(Integer dia, Integer mes, Integer anio) {
        try {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
            // Period periodo = Period.between(fechaNacimiento, fechaActual);
            // return fechaActual.getYear() - fechaNacimiento.getYear(); // tiene un margen de error de un año aprox.
            Long respuesta = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
            return respuesta.intValue();
        } catch (Exception e) {
            return 0;
        }
    }

}
