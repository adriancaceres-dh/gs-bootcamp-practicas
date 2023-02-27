package ClaseAbstracta;

public class Perro extends Animal implements Carnivoro{

    public Perro(String nombre, String tipoAnimal) {
        super(nombre, tipoAnimal);
    }

    @Override
    public String emitirSonido() {
        return "Guauu";
    }

    @Override
    public String comeCarne() {
        return "El perro come carne";
    }
}
