package com.bootcamp.Practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosScript {

    @GetMapping("/{num1}/{num2}")
    public String numeroRomano(@PathVariable int num1, @PathVariable int num2){
        String result = "0";
        if(num1 > 0){
            switch (num1){
                case 1: result = "X";
                break;

                case 2: result = "XX";
                break;

                case 3: result = "XXX";
                break;

                case 4: result = "XL";
                break;

                case 5: result = "L";
                break;

                case 6: result = "LX";
                break;

                case 7: result ="LXX";
                break;

                case 8: result = "LXXX";
                break;

                case 9: result = "XC";
                break;
            }
        }
        switch (num2){
            case 0: result = result;
            break;

            case 1: result = result + "I";
                break;

            case 2: result = result + "II";
                break;

            case 3: result = result + "III";
                break;

            case 4: result = result + "IV";
                break;

            case 5: result = result + "V";
                break;

            case 6: result = result + "VI";
                break;

            case 7: result = result + "VII";
                break;

            case 8: result = result + "VIII";
                break;

            case 9: result = result + "IX";
                break;
        }
        return result;
    }
}
