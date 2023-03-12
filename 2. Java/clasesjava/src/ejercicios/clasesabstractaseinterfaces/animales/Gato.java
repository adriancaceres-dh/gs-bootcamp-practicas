package ejercicios.clasesabstractaseinterfaces.animales;

public class Gato extends Animal implements Carnivoro{

    public Gato(){

    }

    public Gato(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String emitirSonido() {
        return "Miau Miau";
    }

    @Override
    public String comerCarne() {
        return "El gato come carne";
    }
}
