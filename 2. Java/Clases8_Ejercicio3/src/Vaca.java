public class Vaca extends Animal implements Herbivoro{
    public Vaca() {
    }

    public Vaca(String nombre, String tipo) {

        super(nombre, tipo);
    }

    @Override
    public String comerHierba() {
        return "La vaca esta comiendo hierba.";
    }

    @Override
    public String emitirSonido() {
        return "Muuuuuuu muuuuuuuuu";
    }
}