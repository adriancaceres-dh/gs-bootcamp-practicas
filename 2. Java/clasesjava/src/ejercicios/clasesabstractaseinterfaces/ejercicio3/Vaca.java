package ejercicios.clasesabstractaseinterfaces.ejercicio3;

public class Vaca extends Animal implements Herbivoro{
    @Override
    public void emitirSonido() {
        System.out.println("Muuu");
    }

    @Override
    public void comerHierba() {
        System.out.println("La vaca está comiendo hierba.");
    }
}
