package com.example.Spring.clase2_ejercicioCalculadora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class CalculadoraEdad {
    @GetMapping("/{dia}/{mes}/{anio}")
    public String edad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio){
        return calcularFecha(dia,mes,anio);
    }

    @GetMapping("/obtenerfecha")

    //aca pasamos la utl localhost:8080/obtenerfecha?dia=24&mes=10&anio=1992
    public String obtenerfechaPorURL(@RequestParam Integer dia, @RequestParam Integer mes, @RequestParam Integer anio){
        return calcularFecha(dia,mes,anio);
    }

    //Metodo para reutilizar codigo
    private String calcularFecha(Integer dia, Integer mes, Integer anio){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaIngresada = LocalDate.of(anio,mes,dia);
        Period diferencia = Period.between(fechaIngresada,fechaActual);

        return "La edad de la persona es: " + diferencia.getYears() + " años."
                + " Edad detallada: " + diferencia.getDays() + " días, " + diferencia.getMonths() + " Meses, " + diferencia.getYears() + " años." ;
    }

}
