package com.bootcamp;

public class Vaca extends Animal implements Hervivoro{
    @Override
    public void emitirSonido() {
        System.out.println(this.getSonido());
    }

    @Override
    public void comerHierba() {
        System.out.println("Come hierba");
    }
}
