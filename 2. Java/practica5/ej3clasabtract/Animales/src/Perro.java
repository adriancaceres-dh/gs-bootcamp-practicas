public class Perro extends Animal implements Carnivoro{
    public Perro() {
    }

    @Override
    public String Sonido() {
       return "guau";
    }

    @Override
    public String Carnivoro() {
        return "carne";
    }
}
