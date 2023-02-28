package com.ejerciciomultiplesparametros.ejerciciomultiplesparametros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class Age {

    @GetMapping("/{day}/{month}/{year}")
    public Integer getAge(@PathVariable Integer day, @PathVariable Integer month, @PathVariable Integer year) {

        try {
            LocalDate fechaNacimiento = LocalDate.of(year, month, day);

            // Obtenemos la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Calculamos la diferencia entre la fecha actual y la fecha de nacimiento
            Period diferencia = Period.between(fechaNacimiento, fechaActual);//
            // Obtenemos la edad en años
            Integer edad = diferencia.getYears();
            // Integer edad = fechaActual.getYear()- fechaNacimiento.getYear();

            return edad;

        }catch (Exception exception){
            return 0;
        }
    }
    @GetMapping(path = "/calcularedad")
    public Integer getEdadOtro(@RequestParam Integer day, @RequestParam Integer month, @RequestParam Integer year) {
        try {
            LocalDate fechaNacimiento = LocalDate.of(year, month, day);

            // Obtenemos la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Calculamos la diferencia entre la fecha actual y la fecha de nacimiento
            Period diferencia = Period.between(fechaNacimiento, fechaActual);//
            // Obtenemos la edad en años
            Integer edad = diferencia.getYears();
            // Integer edad = fechaActual.getYear()- fechaNacimiento.getYear();

            return edad;

        }catch (Exception exception){
            return 0;
        }

    }
}


