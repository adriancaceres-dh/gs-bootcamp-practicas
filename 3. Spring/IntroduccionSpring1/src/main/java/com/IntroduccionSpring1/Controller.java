package com.IntroduccionSpring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path="/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hello World "+nombre;
    }

    @GetMapping(path="/hello/{nombre}/{apellido}/{edad}")
    public String sayHello(@PathVariable String nombre,@PathVariable String apellido,@PathVariable String edad){
        return  "Hello World! Tu nombre es: "+nombre+", tu apellido es: "+apellido+" y tenés "+edad+" años";
    }
}
