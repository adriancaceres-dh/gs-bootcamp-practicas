package com.example.helloFacundo.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controllers {


    @GetMapping("/hello/{nombre}")
    public String Hello(@PathVariable String nombre) {
        return "Hola Mundo" + nombre;
    }

    @GetMapping("/bay/{nombre}/{apellido}/{edad}")
    public String bay(@PathVariable String nombre,
                      @PathVariable String apellido,
                      @PathVariable int edad){
        return "Tu nombre es " + nombre + ", tu apellido es " + apellido + " y tenes " + edad;
    }



}
