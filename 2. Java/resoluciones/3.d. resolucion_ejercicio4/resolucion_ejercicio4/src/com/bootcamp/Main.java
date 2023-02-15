package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion de variables
        double premioBruto, premioNeto;
        double impuesto1 = 0.0245, impuesto2 = 0.15, impuesto3 = 0.03;

        //Se ingresa por teclado el monto del premio en bruto a calcular
        System.out.println("Ingrese el monto el bruto del premio para calcular el total con los descuentos de impuestos");
        Scanner teclado = new Scanner(System.in);
        premioBruto = teclado.nextDouble();

        //Se realizan los calculos correspondientes
        impuesto1=premioBruto*impuesto1;
        impuesto2=premioBruto*impuesto2;
        impuesto3=premioBruto*impuesto3;

        premioNeto = premioBruto-impuesto1-impuesto2-impuesto3;

        //Se muestra por pantalla del resultado
        System.out.println("El premio neto, con los impuestos aplicados es: " + premioNeto);


    }
}
