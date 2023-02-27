package com.bootcamp.animales;

public interface Carnivoro {
    public default void comerCarne() {
        System.out.println("Carnivoro");
    }
}
