package com.bootcamp.proyecto2702;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class numerosRomanos {

    @GetMapping("/romanos/{numero}")
    public String pasarARomano(@PathVariable Integer numero){
        System.out.println(numero);

        return numero.toString();
    }
}
