package ClaseAbstracta;

public class Gato extends Animal implements Carnivoro{

    public Gato(String nombre, String tipoAnimal) {
        super(nombre, tipoAnimal);
    }

    @Override
    public String emitirSonido() {
        return "Miauu";
    }

    @Override
    public String comeCarne() {
        return "El gato come carne";
    }
}
