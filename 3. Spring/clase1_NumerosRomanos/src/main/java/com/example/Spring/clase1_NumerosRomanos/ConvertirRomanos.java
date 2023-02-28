package com.example.Spring.clase1_NumerosRomanos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertirRomanos {
    //ROMANOS(M=1000,CM=900,D=500,CD=400,C=100,XC=90,L=50,XL=40,X=10,IX=9,V=5,IV=4,I=1 2840
    @GetMapping("/{numero}")
    public String convertirRomanos(@PathVariable int numero) {
        //FORMA 1:

        String romano = "";

        if(numero < 1 || numero > 3999){
            return "Favor de ingresar un numero entre 1 y 3999";

        }else{
            int miles = numero / 1000;
            int centena = numero / 100 % 10;
            int decena = numero / 10 % 10;
            int unidad = numero % 10;

            //OBSERVO LOS MILES
            for(int i = 1; i <= miles; i++){
                romano += "M";
            }

            //OBSERVO LA CENTENA
            if(centena == 9){
                romano += "CM";
            }else if(centena >= 5){
                romano += "D";
                for(int i = 6; i <= centena; i++){
                    romano += "C";
                }
            }else if(centena == 4){
                romano += "CD";
            }else{
                for(int i = 1; i <= centena; i++){
                    romano += "C";
                }
            }

            //OBSERVO LA DECENA
            if(decena == 9){
                romano += "XC";
            }else if(decena >= 5){
                romano += "L";
                for(int i = 6; i <= decena; i++){
                    romano += "X";
                }
            }else if(decena == 4){
                romano += "XL";
            }else{
                for(int i = 1; i <= decena; i++){
                    romano += "X";
                }
            }

            //OBSERVO LA UNIDAD
            if(unidad == 9){
                romano += "IX";
            }else if(unidad >= 5){
                romano += "V";
                for(int i = 6; i <= unidad; i++){
                    romano += "I";
                }
            }else if(unidad == 4){
                romano += "IV";
            }else {
                for(int i = 1; i <= unidad; i++){
                    romano += "I";
                }
            }

            return "El numero romano del entero " + numero + " es: " + romano;
        }



        //FORMA 2:
        /*
        if (numero < 1 || numero > 3999) {
            return "Por favor elegir un número entre 1 y 3999";

        } else {
            String romano = "";

            String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] enteros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

            for (int i = 0; i < romanos.length; i++) {
                while (numero >= enteros[i]) {
                    romano += romanos[i];
                    numero -= enteros[i];
                }
            }
            return "El numero romano del entero es: " + romano;
        }
        */
    }
}
