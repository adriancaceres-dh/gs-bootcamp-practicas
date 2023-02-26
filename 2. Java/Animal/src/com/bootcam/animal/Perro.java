package com.bootcam.animal;

public class Perro extends Animal implements ComerCarne {

    public void EmitirSondido() {
        System.out.println("Guau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Es carnivoro");
    }
}
