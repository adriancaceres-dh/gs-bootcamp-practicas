package com.bootcamp.primerProyecto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping
    public String saludo1() {
        return "Hello World";
    }

   @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre) {
        System.out.println("Solo lo vemos los coders");
        return "Hola mundo,  " + nombre;
    }

    @GetMapping("/saludo/{nombre1}/{apellido}/{edad}")
    public String saludo1(@PathVariable String nombre1,
                      @PathVariable String apellido,
                      @PathVariable int edad){
        return "Hola mundo! Tu nombre es: " + nombre1 + ", tu apellido es: " + apellido + " y tenés " + edad + " años";
    }
}
