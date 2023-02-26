package com.bootcam.animal;

public class Vaca extends Animal implements ComerHierba{


    public void EmitirSondido() {
        System.out.println("Muuuu!");
    }

    @Override
    public void comerHierba() {
        System.out.println("Es hervíboro");
    }
}
