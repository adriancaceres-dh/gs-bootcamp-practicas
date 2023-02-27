package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping()
    public String saludo1(){
        return "Hola Mundo";
    }
    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String bay(@PathVariable String nombre,
                      @PathVariable String apellido,
                      @PathVariable int edad){
        return "Hola mundo: tu nombre es " + nombre + ", tu apellido es " + apellido + " y tenes " + edad;
    }

}
