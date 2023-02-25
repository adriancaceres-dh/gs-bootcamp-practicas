package com.bootcamp.animales;

public class Gato extends Animal implements ComerAnimal{
    @Override
    public void ComerAnimals(GustosAlimenticios e) {
        e.comerCarne();
    }
}
