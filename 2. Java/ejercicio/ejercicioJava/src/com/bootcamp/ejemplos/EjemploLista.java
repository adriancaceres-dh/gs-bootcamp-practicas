package com.bootcamp.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Mirko");

        System.out.println(nombres);

        for (String e: nombres) {
            System.out.println(e);
        }

        nombres.add("Erik");
        nombres.add(0,"Maria");

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Franco");
        nombres.addAll(3,masNombres);
        System.out.println(nombres);
    }
}
