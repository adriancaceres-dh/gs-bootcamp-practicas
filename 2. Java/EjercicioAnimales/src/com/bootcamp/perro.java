package com.bootcamp;

public class perro extends Animal implements Carnivoro{
    @Override
    public void emitirSonido() {
        System.out.println(this.getSonido());
    }

    @Override
    public void comerCarne() {
        System.out.println("Come carne");
    }

    @Override
    public void comerAnimal(Animal animal) {
        System.out.println("Come a " + animal);
    }
}
