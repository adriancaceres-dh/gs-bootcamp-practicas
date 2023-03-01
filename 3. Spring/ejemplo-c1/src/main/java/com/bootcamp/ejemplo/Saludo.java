package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Saludo {
    public String nombre;
    public String apellido;

    public  int edad;


    @GetMapping("/bay/{nombre}/{apellido}/{edad}")

    public String bay(@PathVariable String nombre,
                      @PathVariable String apellido,
                      @PathVariable int edad){
        return "Tu nombre es " + nombre + ", tu apellido es " + apellido + " y tenes " + edad;
    }




}

