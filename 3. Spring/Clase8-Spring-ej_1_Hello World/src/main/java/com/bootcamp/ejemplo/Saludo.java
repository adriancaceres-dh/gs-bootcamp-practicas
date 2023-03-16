package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Saludo {

    @GetMapping()
    public String saludo1() {
        return "Hola mundo";
    }

    //ejercicio 1:
    @GetMapping("/hello")
    public String saludo() {
        return "Hello world";
    }

    //ejercicio 2:
    @GetMapping("/{nombre}")
    public String saludo(@PathVariable String nombre) {
        System.out.println("Solo lo vemos los coders");
        return "Hola " + nombre;

    }
//Ejercicio 3:
    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saluda(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad) {
        return "Hola " + nombre + " " + apellido + " tu edad es de " + edad;
    }
}

