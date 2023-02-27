package Ejercicio3;

public class Perro extends Animal implements Carnivoro{

    @Override
    public void emitirSonido() {
        System.out.println("Perro");
    }

    @Override
    public void comerCarne() {
        System.out.println("Come carne");
    }
}
