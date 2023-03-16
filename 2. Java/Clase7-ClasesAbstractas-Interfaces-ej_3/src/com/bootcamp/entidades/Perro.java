package com.bootcamp.entidades;

public class Perro extends Animal implements Carnivoro{
    public Perro() {
    }

    public Perro(String nombre, String raza, int miembros) {
        super(nombre, raza, miembros);
    }

    @Override
    public String emitirSonido() {
        return "El perro hace Guau";
    }

    @Override
    public String comerCarne() {
        return "se alimenta de carne";
    }
}



