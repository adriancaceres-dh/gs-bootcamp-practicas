package clasesabstractaseinterfacesejercicio3;

public class Gato extends Animal implements Carnivoro{
    public Gato(){}

    public Gato(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String emitirSonido() {
        return " miauuuu miauuuu";
    }

    @Override
    public String comerCarne() {
        return "el gatito solo come carne";
    }
}
