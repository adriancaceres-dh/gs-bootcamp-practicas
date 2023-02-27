package com.bootcamp.animales;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void comerCarne() {
        System.out.println("Come carne");
    }
}
