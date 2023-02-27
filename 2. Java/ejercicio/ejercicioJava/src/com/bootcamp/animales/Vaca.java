package com.bootcamp.animales;

public class Vaca extends Animal implements Herviboro{
    @Override
    public void comerHierva() {
        System.out.println("Come hierba");
    }
}
