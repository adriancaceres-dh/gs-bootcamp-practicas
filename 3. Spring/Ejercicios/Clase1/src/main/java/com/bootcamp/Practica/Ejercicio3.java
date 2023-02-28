package com.bootcamp.Practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio3 {

    @GetMapping("/{name}/{apellido}/{edad}")
    public String saludoCompleto(@PathVariable String name,@PathVariable String apellido,@PathVariable int edad){
        return "Hello " + name + " " + apellido + ", tu edad es: " + edad;
    }
}
