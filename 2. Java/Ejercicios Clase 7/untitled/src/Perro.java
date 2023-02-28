public class Perro extends Animal implements ComerCarne {

    public void EmitirSonido() {
        System.out.println("Guau!");
    }

    @Override
    public void comerCarne() { System.out.println("Es carnivoro"); }
}
