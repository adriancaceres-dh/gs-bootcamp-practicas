package com.bootcamp.Practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio2 {

    @GetMapping("/{name}")
    public String saludo(@PathVariable String name){
        return "Hello " + name;
    }
}
