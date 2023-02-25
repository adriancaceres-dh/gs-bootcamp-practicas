package com.bootcamp.varios;

public class EjercicioExcepciones {
    public static void main(String[] args) {



      //  Ejercicio 1

        try {
            int a = 0;
            int b = 300;
            int cociente = b/a;
        } catch (IllegalArgumentException e) {
            System.out.println("No se puede dividir por cero");
        }  catch (ArithmeticException e) {
           // System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        System.out.println("Programa finalizado");




        // Ejercicio 2

        //Mensaje final
        String mensajeFinal = "Este es el último mensaje";

        //Código que arroja excepción


        try {
            int[] numeros = new int[5];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(mensajeFinal);




    }
}
