package com.bootcamp.ejemplo.controller;

import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
public class CalcularEdad {


    @GetMapping("/calcularEdad/{dia}/{mes}/{anio}")
    public String calcularEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio) {
        LocalDate fechaActual = LocalDate.now();
        int day = fechaActual.getDayOfMonth();
        int month = fechaActual.getMonthValue();
        int age = fechaActual.getYear();
        int ageFinal = age - anio;
        if (month < mes) {
            ageFinal = ageFinal - 1;
        }  else if (month == mes){
            if(day < dia){
                ageFinal = ageFinal -1;
            }
        }
        return "Tienes "+ ageFinal + " años.";
    }
    @GetMapping("/calcularEdad1/")
    public String calcularEdad1(@RequestParam Integer dia, @RequestParam Integer mes, @RequestParam Integer anio) {
        LocalDate fechaActual = LocalDate.now();
        int day = fechaActual.getDayOfMonth();
        int month = fechaActual.getMonthValue();
        int age = fechaActual.getYear();
        int ageFinal = age - anio;
        if (month < mes) {
            ageFinal = ageFinal - 1;
        }  else if (month == mes){
            if(day < dia){
                ageFinal = ageFinal -1;
            }
        }
        return "Tienes "+ ageFinal + " años.";
    }

     @GetMapping("/hello")
    ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}