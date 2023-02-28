package com.bootcamp.ejemploSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saludar(@PathVariable String nombre,@PathVariable String apellido,@PathVariable int edad) {
        System.out.println("solo lo vemos los coders");
        return "Hola mundo! Tu nombre es " + nombre + ", tu apellido es " + apellido + " y tenes " + edad;
    }
}
