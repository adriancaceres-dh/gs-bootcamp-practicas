package com.bootcamp.animales;

public interface ComerAnimal {

    public default void ComerAnimals(GustosAlimenticios e) {
        System.out.println(e);
    }
}
