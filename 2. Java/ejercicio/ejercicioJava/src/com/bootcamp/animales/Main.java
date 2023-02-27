package com.bootcamp.animales;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();


        perro.emitirSonidoPerro();
        gato.emitirSonidoGato();
        vaca.emitirSonidoVaca();


        perro.comerCarne();
        gato.comerCarne();
        vaca.comerHierva();

    }

}
