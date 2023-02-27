package ejercicios.clasesabstractaseinterfaces.ejercicio3;

public class Perro extends Animal implements Carnivoro{

    //implementamos el metodo de Animal en Perro
    @Override
    public void emitirSonido() {
        System.out.println("Guau");
    }

    @Override
    public void comerCarne() {
        System.out.println("El perro está comiendo carne.");
    }
}
