package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
    @GetMapping()
    public String saludo1() {
        return "Hola mundo";
    }
    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre) {
        System.out.println("Solo lo vemos los coders ");
        return "Hola " + nombre;
    }

    @GetMapping("/{nombre}/{edad}")
    public String saludoconedad(@PathVariable String nombre,@PathVariable Integer edad) {
        edad++;
        return "Hola " + nombre + " tenes " + edad + " años";
    }

}
