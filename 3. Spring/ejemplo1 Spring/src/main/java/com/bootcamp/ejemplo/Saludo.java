package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {


    @GetMapping()
    public String saludar() {
        return "Hola mundo";
        //EJEMPLO SIN PARAMETROS
    }

    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre) {
        System.out.println("Solo lo vemos los coders ");
        return "Hola " + nombre;
    }

    /*
    @GetMapping("/{Jonatan}/{Garcia}/{37}")
    public String bay(@PathVariable String nombre,
                      @PathVariable String apellido,
                      @PathVariable int edad){
        return "Tu nombre es " + nombre + ", Tu apellido es: " + apellido + " y tenes " + edad;
    } */
}
