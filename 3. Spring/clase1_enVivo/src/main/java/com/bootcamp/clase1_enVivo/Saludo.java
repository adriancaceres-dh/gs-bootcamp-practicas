package com.bootcamp.clase1_enVivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController //se utiliza para crear controladores web que devuelven objetos como respuestas HTTP, en lugar de vistas. Es una forma simplificada y conveniente de crear servicios web RESTful en una aplicación de Spring.
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

   /* @GetMapping
    public String saludo1(){
        return "Hola Mundo";
    }

    @GetMapping("/{name}") //se utiliza para asignar una URL de solicitud HTTP a un método de controlador que manejará solicitudes HTTP GET en una aplicación web de Spring.

    public String saludo(@PathVariable String name){
        System.out.println("Hola programador!!");
        return "Hola " + name;
    }*/

}
