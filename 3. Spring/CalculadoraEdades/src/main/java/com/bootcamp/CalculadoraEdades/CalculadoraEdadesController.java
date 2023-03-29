package com.bootcamp.CalculadoraEdades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class CalculadoraEdadesController {
    @GetMapping("/edad")
    public String edad(@RequestParam Integer day, @RequestParam Integer month, @RequestParam Integer year){

        //establecemos la fecha de hoy
        LocalDate fechaHoy = LocalDate.now();

        //conseguimos la fecha que se pasa por parametro
        LocalDate fechaNacimiento = LocalDate.of(year,month,day);

        //comparamos el periodo entre las dos fechas
        Period periodo = Period.between(fechaNacimiento, fechaHoy);


        //pedimos solamente los años de diferencia entre ambas fechas
        return "Tu edad es de " + periodo.getYears() + " años";

        // http://localhost:8080/edad?day=22&month=12&year=2002
    }
}