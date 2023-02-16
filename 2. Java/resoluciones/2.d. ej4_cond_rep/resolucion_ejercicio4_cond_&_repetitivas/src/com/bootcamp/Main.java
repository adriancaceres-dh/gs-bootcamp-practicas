package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int contadorPersonas = 1, contadorDiarioAC = 0,
                contadorDiarioAB = 0, contadorDiarioBC = 0, contadorDiarioA = 0, contadorTodos = 0;
        String diarioA, diarioB, diarioC;


        Scanner teclado = new Scanner(System.in);


        while (contadorPersonas <= 50) {

            System.out.println("Datos relevados de la persona número: " + contadorPersonas);
            System.out.println("Ingrese (si) si la persona esta suscripta al Diario A");
            diarioA = teclado.next();
            System.out.println("Ingrese (si) si la persona esta suscripta al Diario B");
            diarioB = teclado.next();
            System.out.println("Ingrese (si) si la persona esta suscripta al Diario C");
            diarioC = teclado.next();

            //Se utiliza el método equalsIgnoreCase para comparar Strings sin importar mayúsculas y minúsculas
            if (diarioA.equalsIgnoreCase("si" ) && !diarioB.equalsIgnoreCase("si") && !diarioC.equalsIgnoreCase("si")) {
                contadorDiarioA++;
            }
            if (diarioA.equalsIgnoreCase("si") && diarioC.equalsIgnoreCase("si")) {
                contadorDiarioAC++;
            }
            if (diarioA.equalsIgnoreCase("si") && diarioB.equalsIgnoreCase("si")) {
                contadorDiarioAB++;
            }
            if (diarioB.equalsIgnoreCase("si") && diarioC.equalsIgnoreCase("si")) {
                contadorDiarioBC++;
            }
            if (diarioA.equalsIgnoreCase("si") && diarioB.equalsIgnoreCase("si") && diarioC.equalsIgnoreCase("si")) {
                contadorTodos++;
            }

            contadorPersonas++;
            
        }
        System.out.println("------------------------INFORME FINAL----------------------------------");
        System.out.println("La cantidad de personas suscriptas a los 3 diarios es: " + contadorTodos);
        System.out.println("La cantidad de personas suscriptas sólo al diario A es: " + contadorDiarioA);
        System.out.println("La cantidad de personas suscriptas al diario A y diario C es: " + contadorDiarioAC);
        System.out.println("La cantidad de personas suscriptas al diario A y diario B es: " + contadorDiarioAB);
        System.out.println("La cantidad de personas suscriptas al diario B y diario C es: " + contadorDiarioBC);
        System.out.println("------------------------------------------------------------------------");

    }
}
