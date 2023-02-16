package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int cantidadClientes = 1, tipoServicio;
        double precioFijo = 1500, servicioPatrullaje = 700;

        Scanner teclado = new Scanner(System.in);


        while (cantidadClientes <= 7) {
            System.out.println("Ingrese el tipo de servicio para el cliente numero: " + cantidadClientes);
            System.out.println("Ingrese 1: --> para Servicio de Seguridad con camaras");
            System.out.println("Ingrese 2: --> para Servicio de Seguridad con camaras + Patrullaje");
            tipoServicio = teclado.nextInt();

            switch (tipoServicio) {

                case 1:
                    System.out.println("Servicio 1 -- Seguridad con camaras");
                    System.out.println("Cliente numero:" + cantidadClientes);
                    System.out.println("El monto a abonar es: " + precioFijo);
                    cantidadClientes++; //El contador sólo se aumenta si se calcula la factura de un servicio existente
                    break;
                case 2:
                    System.out.println("Servicio 2 -- Seguridad con camaras + Patrullaje");
                    System.out.println("Cliente numero:" + cantidadClientes);
                    System.out.println("El monto a abonar es: " + (precioFijo + servicioPatrullaje));
                    cantidadClientes++; //El contador sólo se aumenta si se calcula la factura de un servicio existente
                    break;
                default:
                    System.out.println("El número de servicio ingresado es incorrecto");
            }
            System.out.println(" ");
            System.out.println("-----------------------------------------------------------");


        }

    }
}
