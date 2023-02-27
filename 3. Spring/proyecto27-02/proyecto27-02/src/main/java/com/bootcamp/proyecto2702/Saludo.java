package com.bootcamp.proyecto2702;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    @GetMapping("/prueba")
    public String prueba(){
        return "Hola, entraste a la pagina de prueba";
    }

    /*
    @GetMapping("/{nombre}") //sirve para aclarar la ruta url y sus parametros
    public String saludar(@PathVariable String nombre){

        System.out.println("Solo coders");// solo en nuestra terminal

        return "Hola " + nombre; //lo que vemos en la vista

     */
    }

