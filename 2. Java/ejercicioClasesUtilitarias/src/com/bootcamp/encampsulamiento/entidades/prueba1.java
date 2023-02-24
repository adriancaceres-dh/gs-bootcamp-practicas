package com.bootcamp.encampsulamiento.entidades;

import java.util.ArrayList;
import java.util.List;

public class prueba1 {
    public static void main(String[] args) {
        List<Prueba> pruebas = new ArrayList<>();
        pruebas.add(new Prueba (234, "Juan"));
        pruebas.add(new Prueba (231, "Carlos"));
        pruebas.add(new Prueba (24, "Pedro"));


        // Quiero que las personas (Prubea) con dni mayor a 50 mil
        List<Prueba> pruebas1 = new ArrayList<>();
        for(Prueba prueba: pruebas){
            if(prueba.getDni()>50000){
                pruebas1.add(prueba);
            }
            System.out.println(prueba);
        }
        for (Prueba prueba: pruebas){
            System.out.println(prueba);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Hecho con forEach");
        pruebas.forEach ( prueba -> System.out.println(prueba));

        System.out.println("-------------------------------------------------");
        //filtra las personas con dni mayores a 200 y luego los imprime al recorrerlo. El filter devuelve una nueva list
        // y luego con el forEach imprimimos el resultado.

        pruebas.stream().filter(p -> p.getDni()>200).forEach(p -> System.out.println(p));
        System.out.println("-------------------------------------------------");
        System.out.println("Ordena de menor a mayor");
        pruebas.stream().sorted((p,q)-> p.getDni()>=q.getDni() ? 1:-1) // si cambio el orden del 1 : -1 a -1 : 1 los ordena al reves
                .forEach(p -> System.out.println(p));

        System.out.println("-------------------------------------------------");
        System.out.println("Nueva lista pero solo con los dni");
        pruebas.stream().mapToInt(p -> p.getDni()).forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------");
        System.out.println("Sumar todos los datos");
        System.out.println(pruebas.stream().mapToInt( p -> p.getDni()).sum());
    }

}
