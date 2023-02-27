package clasesabstractaseinterfacesejercicio3;

public class Vaca extends Animal implements Hervivoro{

    public Vaca(){}

    public Vaca(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String emitirSonido() {
        return "muuuuu";
    }

    @Override
    public String comerHierba() {
        return "La vaca solo come hierba";
    }
}
