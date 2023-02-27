package com.bootcamp.Prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping()
    public String saludar(){
        return "hello world" ;
    }
    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre){
        return "hello " + nombre;
    }
    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saludar(@PathVariable String nombre, @PathVariable String apellido, @PathVariable int edad){
        return "Tu nombre es " + nombre + " tu apellido es  " + apellido + " y tenés " +edad + " años";
    }
}
