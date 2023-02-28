package com.bootcamp.Ejemplo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {

    @GetMapping("/aromano/{numero}")
    public String pasarARomanao(@PathVariable Integer numero){
        String numeroRomano= "";
        int [] numeroComparacion={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numerosRomanos= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i = 0; i < numeroComparacion.length;i++)
            for(;numero >= numeroComparacion[i];numero=numeroComparacion[i])
                numeroRomano=numeroRomano + numerosRomanos[i];
        return numeroRomano.toString();
    }


}
