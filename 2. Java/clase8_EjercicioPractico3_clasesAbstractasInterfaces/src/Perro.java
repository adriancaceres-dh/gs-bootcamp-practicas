public class Perro extends Animal implements Carnivoro{
    public Perro() {
    }

    public Perro(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau guau guau!");
    }


}
