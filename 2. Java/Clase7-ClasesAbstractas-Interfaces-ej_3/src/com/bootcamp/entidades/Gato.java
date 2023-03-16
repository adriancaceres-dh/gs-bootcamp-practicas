package com.bootcamp.entidades;

public class Gato extends Animal implements Carnivoro{
    public Gato() {}

    public Gato(String nombre, String raza, int miembros) {
        super(nombre, raza, miembros);
    }

    @Override
    public String emitirSonido() {
        return "El gato hace Miauuuu";
    }

    @Override
    public String comerCarne() {
        return "se alimenta de carne";
    }
}
