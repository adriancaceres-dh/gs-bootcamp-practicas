package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double precioCosto, precioVenta = 0, porcentajeEnvio = 0, porcentajeGanancia = 0;
        int numeroFabrica;


        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido al software de Tienda de Ropa");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el precio de costo del producto");
        precioCosto = teclado.nextDouble();

        //Se mantiene la ejecución del programa con un centinela, Mientras el Precio de Costo sea distinto de 0 (cero) el programa se ejecuta.
        // Cuando es igual a 0 (cero), finaliza.

        while (precioCosto != 0) {

            System.out.println("Ingrese el número de fábrica para calcular el precio de venta");
            numeroFabrica = teclado.nextInt();

            switch (numeroFabrica) {

                case 1:
                    System.out.println("Fábrica con distancia a sede principal a 500km");
                    System.out.println("El costo de envío es del 7%");
                    porcentajeEnvio = precioCosto * 0.07;
                    precioVenta = precioCosto + porcentajeEnvio;
                    porcentajeGanancia = precioVenta * 0.25;
                    precioVenta = precioVenta + porcentajeGanancia;
                    break;
                case 2:
                    System.out.println("Fábrica con distancia a sede principal a 780km");
                    System.out.println("El costo de envío es del 15%");
                    porcentajeEnvio = precioCosto * 0.15;
                    precioVenta = precioCosto + porcentajeEnvio;
                    porcentajeGanancia = precioVenta * 0.25;
                    precioVenta = precioVenta + porcentajeGanancia;
                    break;
                case 3:
                    System.out.println("Fábrica con distancia a sede principal a 1200km");
                    System.out.println("El costo de envío es del 22%");
                    porcentajeEnvio = precioCosto * 0.22;
                    precioVenta = precioCosto + porcentajeEnvio;
                    porcentajeGanancia = precioVenta * 0.25;
                    precioVenta = precioVenta + porcentajeGanancia;
                    break;
                default:
                    System.out.println("El número de fábrica ingresado es incorrecto");
            }

            if (numeroFabrica == 1 || numeroFabrica == 2 || numeroFabrica == 3) {
                System.out.println("El precio final de venta del producto es: " + precioVenta);
                System.out.println("El precio de costo del producto: " + precioCosto);
                System.out.println("El porcentaje de envío según la fabrica es: " + porcentajeEnvio);
                System.out.println("El porcentaje de ganancia calculado es: " + porcentajeGanancia);
            } else
                System.out.println("Se ha producido un error, vuelva a intentarlo");

            System.out.println("");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese el precio de costo del producto");
            System.out.println("Ingrese 0 para salir");
            precioCosto = teclado.nextDouble();


        }

        System.out.println("La ejecución del programa ha finalizado");

    }


}