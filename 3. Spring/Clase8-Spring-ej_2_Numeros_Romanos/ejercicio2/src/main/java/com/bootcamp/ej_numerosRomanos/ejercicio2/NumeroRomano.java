package com.bootcamp.ej_numerosRomanos.ejercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomano {
    @GetMapping("/romano/{number}")
    public String toRoman(@PathVariable Integer number) {
        //StringBuilder romanNumber = new StringBuilder();
        String romanNumber = "";
        //devuelve hasta el 3.999
        int[] numbersToCompare = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < numbersToCompare.length; i++) {
            for (; number >= numbersToCompare[i]; number -= numbersToCompare[i]) {
                romanNumber = romanNumber + romanNumbers[i];

            }

        }
        return romanNumber.toString();
    }
}
