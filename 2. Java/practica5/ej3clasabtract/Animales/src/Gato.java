public class Gato extends Animal implements Carnivoro{

    @Override
    public String Sonido() {
        return "maiu";
    }

    @Override
    public String Carnivoro() {
        return "carne";
    }
}
