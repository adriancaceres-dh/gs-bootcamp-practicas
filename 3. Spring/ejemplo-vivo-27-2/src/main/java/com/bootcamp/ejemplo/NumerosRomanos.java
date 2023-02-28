package com.bootcamp.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {
    @GetMapping("/romanoNumero/{decimal}")
    public String numRomano(@PathVariable int decimal ){
        String[] romano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] decimales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;
        while (decimal > 0) {
            if (decimales[i] <= decimal) {
                romanNumeral.append(romano[i]);
                decimal -= decimales[i];
            } else {
                i++;
            }
        }
        System.out.println(romanNumeral.toString());
        return romanNumeral.toString();
    }
}

