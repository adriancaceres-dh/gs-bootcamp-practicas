package com.bootcamp.SpringBoot.JSON.Clase28deFebrero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class CalculadoraDeEdades {

    @GetMapping("/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {
        LocalDate fechaHoy = LocalDate.now();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        int edadActual = Period.between(fechaNacimiento, fechaHoy).getYears();

        System.out.println("La persona tiene " + edadActual + " años.");

        return "La persona tiene " + edadActual + " años";

    }

    //Forma 2 de hacerlo
    @GetMapping("/{dia}/{mes}/{anio}")
    public String calcularEdadPorGet(@RequestParam Integer dia, @RequestParam  Integer mes, @RequestParam  Integer anio){
        LocalDate fechaHoy = LocalDate.now();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        int edadActual = Period.between(fechaNacimiento, fechaHoy).getYears();

        System.out.println("La persona tiene " + edadActual + " años.");

        return "La persona tiene " + edadActual + " años";

    }

}

