package com.bootcamp;

public class Main {
    public static void main(String[] args) {

        Gato g1 = new Gato();
        g1.setSonido("Miau1");

        Gato g2 = new Gato();
        g2.setSonido("Miau1");

        System.out.println(g1.equals(g2));

        Gato g3 = g1;
        System.out.println(g3.equals(g1));

        g3.setSonido("Nuevo sonido");

        System.out.println(g1.getSonido());
        System.out.println(g3.getSonido());

        /*
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
        */

    }

    public static String comerAnimal(Animal animal) {
        if (animal instanceof Carnivoro) {
            ((Carnivoro) animal).comerCarne();
        } else if (animal instanceof Hervivoro) {
            ((Hervivoro) animal).comerHierba();
        }
        return "";
    }
}
