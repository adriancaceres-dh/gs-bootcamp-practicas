package com.bootcamp.numerosRomanos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {
    @GetMapping("{/number}")
    public String romano(@PathVariable Integer numero) {
        StringBuilder numeroRomano = new StringBuilder();
        int[] numeroDecimal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numeroRoman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i = 0; i < numeroDecimal.length; i++)
            for (;numero >= numeroDecimal[i]; numero -= numeroDecimal[i])
                numeroRomano.append(numeroRoman[i]);
        return numeroRomano.toString();
    }
}


