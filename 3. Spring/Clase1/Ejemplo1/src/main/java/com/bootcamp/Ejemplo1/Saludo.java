package com.bootcamp.Ejemplo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //se va usar a traves del protocolo http
public class Saludo {

//    @GetMapping()
//    public String saludo1(){
//        return "Hola mundo";
//    }
    @GetMapping("/{nombre}/{apellido}/{edad}")
    public String hello(@PathVariable String nombre, @PathVariable String apellido,
                        @PathVariable Integer edad){
        return "Hola word " +nombre + ", tu apellido es: "+apellido+" y tu edad: "+edad;
    }
}
