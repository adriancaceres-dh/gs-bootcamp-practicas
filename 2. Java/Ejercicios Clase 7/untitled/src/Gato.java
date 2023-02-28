public class Gato extends Animal implements ComerCarne {

    public void EmitirSonido() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() { System.out.println("Es carnivoro"); }
}
