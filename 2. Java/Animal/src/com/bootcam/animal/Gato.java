package com.bootcam.animal;

public class Gato extends Animal implements ComerCarne{

    public void EmitirSondido() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Es carnivoro");
    }
}


