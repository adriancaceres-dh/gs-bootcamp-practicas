package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaración e inicialización de variables
        long dni;
        double sueldo, sueldoConAumento = 0, aumento = 0;

        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese el DNI del empleado para calcular el aumento de sueldo");
        System.out.println("Ingresando DNI = 0 (cero) el programa finaliza");
        dni = teclado.nextLong();

        /*Se utiliza un While controlado por centinela para mantener la ejecución del programa.
        Al ingresar un 0 (cero) como DNI, el programa sale del bucle y finaliza*/

        while (dni != 0) {
            System.out.println("Ingrese el sueldo del empleado para calcular el aumento que le corresponde");
            sueldo = teclado.nextDouble();
            //Se establecen las estructuras condicionales necesarias para cumplir con el objetivo
            if (sueldo <= 20000) {
                System.out.println("Le corresponde un aumento del 20%");
                aumento = sueldo * 0.20;
                sueldoConAumento = sueldo + aumento;

            } else if (sueldo <= 45000) {
                System.out.println("Le corresponde un aumento del 10%");
                aumento = sueldo * 0.10;
                sueldoConAumento = sueldo + aumento;
            } else {
                System.out.println("Le corresponde un aumento del 5%");
                aumento = sueldo * 0.05;
                sueldoConAumento = sueldo + aumento;
            }
            //Se muestra los resultados de los cálculos realizados
            System.out.println("Empleado con DNI: " + dni);
            System.out.println("El sueldo del empleado es: " + sueldo);
            System.out.println("El aumento correspondiente equivale a: " + aumento);
            System.out.println("El sueldo final con el aumento es: " + sueldoConAumento);
            System.out.println("");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("");
            System.out.println("Ingrese el DNI del empleado para calcular el aumento de sueldo");
            //
            System.out.println("Ingrese DNI = 0 (cero) para finalizar el programa");
            dni = teclado.nextLong();

        }

        System.out.println("El programa ha finalizado");
    }
}
