package com.bootcamp.Ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {


    @GetMapping() // endpoint sin parametro
    public String saludar1() {
        return "Hola mundo";
    }

    @GetMapping("/{nombre}")//endpoint con parametro
    public String saludar(@PathVariable String nombre) {
        System.out.println("Solo lo vemos los coders");
        return "Hola mundo " + nombre;
    }

    @GetMapping("/{nombre}/{apellido}/{edad}")//endpoint con parametro
    public String saludar2(@PathVariable String nombre, @PathVariable  String apellido , @PathVariable int edad) {
        return "Hola mundo " + nombre + " " + apellido + " " + edad;
    }
}
