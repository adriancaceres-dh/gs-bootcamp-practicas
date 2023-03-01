package com.bootcamp.proyecto2802;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class Calculadora {

    @GetMapping("/")
    public String incio(){
        return "Hola, para calcular tu edad, coloca en la URL tu fecha de nacimiento";
    }

    @GetMapping("/{dia}/{mes}/{año}")
    public String calcularEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer año){
        Period age;
        LocalDate fechaActual = LocalDate.now();
        LocalDate cumpleaños = LocalDate.of(año, mes, dia);
        age = Period.between(cumpleaños, fechaActual);

        return "Tu cumpleaños es el " + dia + " del mes " + mes + ". Y tenes " + age.getYears() + " años";
    }
}
