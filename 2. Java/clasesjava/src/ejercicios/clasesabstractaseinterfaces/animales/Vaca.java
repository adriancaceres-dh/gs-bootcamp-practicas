package ejercicios.clasesabstractaseinterfaces.animales;

public class Vaca extends Animal implements Herviboro{
    public Vaca(){

    }

    public Vaca(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String emitirSonido() {
        return "Muuuuuuuuuuu";
    }

    @Override
    public String comerHierba() {
        return "La vaca comer pasto";
    }
}
