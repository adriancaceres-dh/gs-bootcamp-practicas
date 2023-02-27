package com.bootcamp;

public interface Carnivoro <T extends Animal> {

    public void comerCarne();

    public void comerAnimal(T animal);
}