package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion de variables
        int dias;
        double precio = 2;
        double total;

        //Se ingresa por teclado la cantidad de dias de la campaña publicitaria para realizar el cálculo
        System.out.println("Por favor, ingrese la cantidad de dias para calcular el costo de la campaña");
        Scanner teclado = new Scanner(System.in);
        dias = teclado.nextInt();

        //Se realiza el cálculo del precio total de la campaña publicitaria
        total = precio * dias;

        //Se muestra por pantalla el resultado
        System.out.println("El costo total de la campaña es: " + total);
    }
}
