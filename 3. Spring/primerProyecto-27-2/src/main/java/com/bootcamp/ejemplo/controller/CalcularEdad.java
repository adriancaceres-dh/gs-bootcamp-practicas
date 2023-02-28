package com.bootcamp.ejemplo.controller;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class CalcularEdad {


    @GetMapping("/calcularEdad/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {
        LocalDateTime myObj = LocalDateTime.now();
        int day = myObj.getDayOfMonth();
        int month = myObj.getMonthValue();
        int age = myObj.getYear();
        int ageFinal = age - anio;
        if (month > mes) {
            ageFinal = ageFinal - 1;
            if (day > dia) {
                ageFinal = ageFinal - 1;
            }
        }
        return "Tienes "+ ageFinal + " años.";
    }

}