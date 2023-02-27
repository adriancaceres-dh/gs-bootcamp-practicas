package Ejercicio3;

public class Vaca extends Animal implements Herviboro{

    @Override
    public void emitirSonido() {
        System.out.println(this.getSonido());
    }

    @Override
    public void comerHierba() {
        System.out.println("Come hierba");
    }
}

