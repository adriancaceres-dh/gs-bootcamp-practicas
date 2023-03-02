package com.bootcamp.Clasevivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appCalculadora {

    @GetMapping("/{dia}/{mes}/{año}")
    public String calcularEdad (@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer año) {
        Integer resultado = 2023 - año;


        return resultado.toString();
    }
}