package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/{hello}")
    public String hello(@PathVariable String hello) {
        return ("Hello World");
    }

    @GetMapping("/{hello}/{nombre}")
    public String helloNombre(@PathVariable String hello, @PathVariable String nombre) {
        return ("Hello World " + nombre);
    }

    @GetMapping("/{hello}/{nombre}/{apellido}/{edad}")
    public String helloNombreCompleto(@PathVariable String hello,
                                      @PathVariable String nombre,
                                      @PathVariable String apellido,
                                      @PathVariable int edad) {
        return ("Hello World! Tu nombre es " + nombre + ", tu apellido es " + apellido + " y tenes " + edad + " años");
    }
}