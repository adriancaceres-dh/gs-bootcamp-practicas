package com.bootcamp;

public class Main {
    public static void main(String[] args) {

        Gato g1 = new Gato();
        g1.setSonido("Miau");
        g1.comerCarne();
        System.out.println(g1.getSonido());

        Vaca v1 = new Vaca();
        v1.setSonido("Muuu");
        v1.comerHierba();
        System.out.println(v1.getSonido());

        Perro p1 = new Perro();
        p1.comerAnimal(v1);

    }
}