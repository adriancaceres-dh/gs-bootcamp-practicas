package com.bootcamp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {
    @GetMapping ("/{dia}/{mes}/{anio}")
    public String obtenerEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        int edad = periodo.getYears();
        return "La fecha ingresada es: " + fechaNacimiento + " su edad es " + edad + " años";
    }
}
