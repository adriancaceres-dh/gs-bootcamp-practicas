package Ejercicio3;

public abstract class Animal {

    public Animal() {
    }


    public void emitirSonidoPerro() {
        System.out.println("¡Guau!");
    }

    public void emitirSonidoGato() {
        System.out.println("¡Miau!");
    }

    public void emitirSonidoVaca() {
        System.out.println("¡Muuu!");
    }




    @Override
    public String toString() {
        return "Animal{}";
    }
}
