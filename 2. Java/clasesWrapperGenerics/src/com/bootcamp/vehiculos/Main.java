package com.bootcamp.vehiculos;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = Arrays.asList(
                new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Focus", 1200),
                new Vehiculo("Ford", "Explorer", 2500),
                new Vehiculo("Fiat", "Uno", 500),
                new Vehiculo("Fiat", "Cronos", 1000),
                new Vehiculo("Fiat", "Torino", 1250),
                new Vehiculo("Chevrolet", "Aveo", 1250),
                new Vehiculo("Chevrolet", "Spin", 2500),
                new Vehiculo("Toyota", "Corolla", 1200),
                new Vehiculo("Toyota", "Fortuner", 3000),
                new Vehiculo("Renault", "Logan", 950)
        );

        Garaje garaje = new Garaje(1, vehiculos);



        System.out.println("------------------------------------------------------");
        System.out.println("lista de vehículos ordenados por precio de menor a mayor ");
        System.out.println("------------------------------------------------------");
        vehiculos.sort(Comparator.comparingDouble(Vehiculo::getCosto));

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() + ", Precio: " + vehiculo.getCosto());
        }
        System.out.println("-----------------------------------------------------");

        vehiculos.sort(
                Comparator.comparing(Vehiculo::getMarca)
                        .thenComparingDouble(Vehiculo::getCosto)
        );

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() + ", Precio: " + vehiculo.getCosto());
        }

        System.out.println("------------------------------------------------------");
        System.out.println(" lista ordenada por marca y a su vez por precio.");
        System.out.println("------------------------------------------------------");


        List<Vehiculo> vehiculosMenor1000 = vehiculos.stream()
                .filter(v -> v.getCosto() <= 1000)
                .toList();

        List<Vehiculo> vehiculosMayor1000 = vehiculos.stream()
                .filter(v -> v.getCosto() >= 1000)
                .toList();

        double promedio = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0);

        System.out.println("Vehículos con precio menor o igual a 1000:");
        vehiculosMenor1000.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo() + ": " + v.getCosto()));

        System.out.println("Vehículos con precio mayor o igual a 1000:");
        vehiculosMayor1000.forEach(v ->System.out.println(v.getMarca() + " " + v.getModelo() + ": " + v.getCosto()));

        System.out.println("--------------------------------------");
        System.out.println("Promedio");
        System.out.println(promedio);

    }
}