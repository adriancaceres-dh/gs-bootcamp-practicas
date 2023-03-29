package com.IntroduccionSpring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;


@RestController
public class Controller {
    @GetMapping("/{dia}/{mes}/{anio}")
    public Integer toRoman(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio) {
        return Period.between(LocalDate.of(anio, mes, dia), LocalDate.now()).getYears();

    }
}
