package com.bootcamp.ejercicioNrosRomanos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertEnteroToRomanController {
    @GetMapping("/{decimal}")
    public String convertir(@PathVariable Integer entero) {

        if (entero <= 0 || entero >= 4000) {
            return "El número debe ser entre 1 y 3999";
        }
        StringBuilder romanoNumero = new StringBuilder();

        int[] decimales = {1000,900,500,400,100,90,50,40,10, 9, 5, 4, 1};
        String[] romanos = {"M","CM","D","CD","C","XC","L","XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < decimales.length; i++)
            for (;entero >= decimales[i]; entero -= decimales[i])
                romanoNumero.append(romanos[i]);

        return romanoNumero.toString();


    }

}

