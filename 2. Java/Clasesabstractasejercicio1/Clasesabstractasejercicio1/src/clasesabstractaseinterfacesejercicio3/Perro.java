package clasesabstractaseinterfacesejercicio3;

public class Perro extends Animal implements Carnivoro{
    public Perro(){}

    public Perro(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String emitirSonido() {
        return "guau";
    }

    @Override
    public String comerCarne() {
        return "El perro solo come carne";
    }
}
