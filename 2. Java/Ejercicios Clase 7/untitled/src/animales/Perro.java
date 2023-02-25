package animales;

public class Perro extends Animal implements ComerAnimal {

    @Override
    public void ComerAnimals(GustosAlimenticios e) { e.comerCarne(); }
}
