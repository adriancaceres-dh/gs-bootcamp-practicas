package com.bootcamp.proyecto2702;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejercicios {

    //Ejercicio N° 1
    @GetMapping("/hello")
    public String saludo(){
        return "Hello World";
    }

    //Ejercicio N° 2
    @GetMapping("/hello{nombre}")
    public String saludo(@PathVariable String nombre){
        return "Hello " + nombre;
    }

    //Ejercicio N° 3
    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saludo(@PathVariable String nombre, @PathVariable String apellido, @PathVariable Integer edad){
        return "Hello World. Tu nombre es: " + nombre + " Tu apellido es: " + apellido + ", y tenes " + edad + " años";
    }


}
