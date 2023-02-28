package com.bootcamp.Practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {

    @GetMapping
    public String inicio(){
        return "Escriba su numero (2 cifras) separando cada uno con / en la url. Formato: XX (Ej. 02, 35)";
    }

}
