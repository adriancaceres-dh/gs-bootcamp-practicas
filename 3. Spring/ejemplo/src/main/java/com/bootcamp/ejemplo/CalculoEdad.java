package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@RestController
public class CalculoEdad {
    @GetMapping("/")
    public String inicio(){
        return "Para calcular tu edad, coloca en la URL tu fecha de nacimiento en el siguiente formato:  dia, mes. año";
    }
    @GetMapping("/{dia}/{mes}/{anio}")
    public String CalculoEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable int anio) {
        // Fecha de nacimiento de la persona
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcula la edad de la persona
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        // Imprime la edad de la persona
        return "La edad de la persona es: " + edad + " años";
    }

}