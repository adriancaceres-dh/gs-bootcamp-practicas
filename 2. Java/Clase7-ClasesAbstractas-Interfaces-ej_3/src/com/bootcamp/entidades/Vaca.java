package com.bootcamp.entidades;

public class Vaca extends Animal implements Herbivoro {
    public Vaca() {}

    public Vaca(String nombre, String raza, int miembros) {
        super(nombre, raza, miembros);
    }

    @Override
    public String emitirSonido() {
        return "La vaca hace Muuu";
    }

    @Override
    public String comerHierba() {
        return "se alimenta de hiervas";
    }
}
