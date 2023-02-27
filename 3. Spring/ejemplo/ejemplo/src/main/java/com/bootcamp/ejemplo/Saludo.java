package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController                       //le indica a spring que la clase sera utilizada para generar una API
public class Saludo {

 // Ejercicio 1
    @GetMapping()                       //configura el metodo para que sea un pto de entrada http GET "/"
    public String saludar1(){
        return "Hello word";
    }

    //Ejercicio 2
    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre){         //le marcamos a spring a interpretar una URL
        System.out.println("Solo lo vemos los coders");
        return "Hello word " + nombre;
    }

    //Ejercicio 3
    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saludar2(@PathVariable String nombre, @PathVariable  String apellido, @PathVariable  String edad){
        System.out.println("Solo lo vemos los coders");
        return "Hello word! " + " Tu nombre es: " + nombre + " Tu apellido es: " + apellido +" y tenes " + edad + " años";
    }
}
