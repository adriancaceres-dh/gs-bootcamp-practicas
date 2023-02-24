public class Gato extends Animal implements Carnivoro{

    public Gato() {
    }

    public Gato(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miauuuuu miauuuuuu");
    }
}
