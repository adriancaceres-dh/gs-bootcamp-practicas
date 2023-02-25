package com.bootcamp.animales;

public class Vaca extends Animal implements ComerAnimal{
    @Override
    public void ComerAnimals(GustosAlimenticios e) {
        e.comerHierba();
    }
}
