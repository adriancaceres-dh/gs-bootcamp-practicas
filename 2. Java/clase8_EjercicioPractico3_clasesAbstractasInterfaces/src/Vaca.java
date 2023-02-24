public class Vaca extends Animal implements Hervivoro{
    public Vaca() {
    }

    public Vaca(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Muuuuuuu muuuuuuuuu");
    }
}
