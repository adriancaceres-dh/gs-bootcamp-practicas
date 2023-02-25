package animales;

public class Gato extends Animal implements ComerAnimal {
    @Override
    public void ComerAnimal(GustosAlimenticios e) {
        e.comerCarne();
    }
}
