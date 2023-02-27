package Ejercicio3;

public class Gato extends Animal implements Carnivoro {

    @Override
    public void emitirSonido() {
        System.out.println(this.getSonido());
    }

    @Override
    public void comerCarne() {
        System.out.println("Come carne");
    }
}

