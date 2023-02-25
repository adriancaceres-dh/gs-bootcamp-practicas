public class Perro extends Animal implements Carnivoro{
    public Perro() {
    }

    public Perro(String nombre, String tipo) {

        super(nombre, tipo);
    }

    @Override
    public String comerCarne() {
        return "El perrito esta comiendo carne.";
    }

    @Override
    public String emitirSonido() {
        return "Guau guau guau!";
    }


}
