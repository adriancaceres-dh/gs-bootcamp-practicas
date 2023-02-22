package com.bootcamps;

public class Ejercicio4 {

    public static int numeroMayor(int numero1, int numero2) {
        return Math.max(numero1, numero2);
    }

    public static int numeroMenor(int numero1, int numero2) {
        return Math.min(numero1, numero2);
    }

    public static double potencia(double numero, double potencia) {
        return Math.pow(numero, potencia);
    }

    public static double coseno(double angulo) {
        return Math.cos(angulo);
    }

    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static int numeroAleatorio() {
        return (int) (Math.random() * 1000);
    }
}