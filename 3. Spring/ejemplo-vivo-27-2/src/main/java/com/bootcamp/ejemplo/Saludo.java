package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
@RestController
public class Saludo {
    @GetMapping("/hello")
    public String saludar(){
        return "Hello word";
    }

    @GetMapping("/hello/{nombre}")
    public String saludarNombre(@PathVariable String nombre){
        return "Hello World " + nombre;
    }

    @GetMapping("/hello/{nombre}/{apellido}/{edad}")
    public String saludarInfo(@PathVariable String nombre, @PathVariable String apellido, @PathVariable String edad){
        return "Hello World!! Tu nombre es: " + nombre + ", tu apellido es: " + apellido + " y tenés: " + edad + " años.";
    }

    /*@GetMapping()
    public String saludo1(){
        return "Hola mundo";
    }
    @GetMapping("/{nombre}")
    public String saludar(@PathVariable String nombre){
        System.out.println("solo lo vemos los coders");
        return "Hola " + nombre;
    }*/
}
