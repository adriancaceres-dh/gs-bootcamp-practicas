package com.bootcamp.ejercicios.condicionales;

import java.util.Scanner;

public class EjercicioCondicionales3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese nombre cliente");
            String nombre = scanner.next();
            System.out.println("ingrese nº de servicio");
            int numeroServicio = scanner.nextInt();

            if (numeroServicio == 1) {
                System.out.println(nombre + " debe abonar $1500");
            } else if (numeroServicio == 2) {
                System.out.println(nombre + " debe abonar $2200");
            } else {
                System.out.println("El nº de serivicio es incorrecto. Ingrese 1 o 2");
            }
        }
    }
}
