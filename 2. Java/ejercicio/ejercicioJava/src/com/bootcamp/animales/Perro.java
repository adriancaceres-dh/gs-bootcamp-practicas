package com.bootcamp.animales;

public class Perro extends Animal implements Carnivoro {

    @Override
    public void comerCarne() {
        System.out.println("Come carne");
    }
}
