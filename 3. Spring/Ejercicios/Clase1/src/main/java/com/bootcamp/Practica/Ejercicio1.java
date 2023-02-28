package com.bootcamp.Practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio1 {

@GetMapping("/hello")
    public String saludo(){
        return "Hello World";
    };
}
