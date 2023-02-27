package com.bootcamp;

public abstract class Animal {
    protected String sonido;

    public Animal() {}

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public void emitirSonido() {}

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}