package ejercicios.clasesabstractaseinterfaces.ejercicio3;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void emitirSonido() {
        System.out.println("Miau");
    }

    @Override
    public void comerCarne() {
        System.out.println("El gato está comiendo carne.");
    }
}
