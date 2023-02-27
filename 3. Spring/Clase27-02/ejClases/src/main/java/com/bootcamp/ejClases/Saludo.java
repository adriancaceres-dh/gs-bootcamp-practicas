package com.bootcamp.ejClases;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Saludo {

    @GetMapping("/hello")
    public String saludar1(){
        return "Hello World";
    }
    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre){
        System.out.println("Solo lo ven los coders");
        return "Hello World " + nombre;
    }

    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saludar2(@PathVariable String nombre,
                      @PathVariable String apellido,
                      @PathVariable int edad){
        return "Tu nombre es " +nombre+ ", tu apellido es " +apellido+ " y tenes " +edad;
    }


}
