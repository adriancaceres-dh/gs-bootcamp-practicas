package com.bootcamp.proyecto2702;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //iniciamos el controlador
public class numerosRomanos {

    //ROMANOS(M=1000,CM=900,D=500,CD=400,C=100,XC=90,L=50,XL=40,X=10,IX=9,V=5,IV=4,I=1 2840
    @GetMapping("/romanos/{numero}")
    public String pasarARomano(@PathVariable Integer numero){

        String romano = "";

        //definimos que numeros pueden recibirse como parametro
        if(numero < 1 || numero > 3999){
            return "Favor de ingresar un numero entre 1 y 3999";
        }else{
            int miles = numero / 1000;
            int centena = numero / 100 % 10;
            int decena = numero / 10 % 10;
            int unidad = numero % 10;

            //trabajamos los miles
            for(int i = 1; i <= miles; i++){
                romano += "M";
            }

            //trabajamos las centenas
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

            //trabajamos las decenas
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

            //trabajamos con las unidades
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
            return "El numero romano del entero: " + numero + " es: " + romano;
        }
    }
}
