package com.bootcamp.ejClases;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotación p/identificar el controlador de un servicio REST
public class Saludo {
   @GetMapping("/hello") //Con el método @GetMapping le estamos diciendo que

    public String holaMundo() {
        System.out.println("Sólo lo vemos los coders");
        return ("Hello World");
    }

   @GetMapping("/{nombre}")

    public String saludar (@PathVariable String nombre) {
        System.out.println("Sólo lo vemos los coders");
        return ("Hello " + nombre);
    }

    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String saludarCompleto (@PathVariable String nombre,
                      @PathVariable String apellido,
                      @PathVariable int edad) {
        return "¡Hello! Tu nombre es " + nombre + " " + apellido + " y tienes " + edad + " años";
    }

    @GetMapping("/{convertidorRomano}/{letra}/{numero}")
    public String convertidorRomano (@PathVariable String letra,
                                    @PathVariable int numero) {

       String letra = "";

        String s = convertidorRomano(letra, edad);
        for (Saludo:
             convertidorRomano(letra, edad);;
             ) {
            
        }        return "¡Hello! Tu nombre es " + nombre + " " + apellido + " y tienes " + edad + " años";
    }
}


