package ClaseAbstracta;

public class Vaca extends Animal implements Hervivoro {

    public Vaca(String nombre, String tipoAnimal) {
        super(nombre, tipoAnimal);
    }

    @Override
    public String emitirSonido() {
        return "Muuu";
    }

    @Override
    public String comeHierva() {
        return "La vaca come hiervas";
    }
}