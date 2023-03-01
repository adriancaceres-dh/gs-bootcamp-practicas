package ClasesAbstractaseInterfaces.Ejercicio3B;

import ClasesAbstractaseInterfaces.Ejercicio3B.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    public Gato() {
    }

    public Gato(String nombre, String tipo) {

        super(nombre, tipo);
    }

    @Override
    public String comerCarne() {
        return "El gatito esta comiendo carne.";
    }

    @Override
    public String emitirSonido() {
        return "Miauuuuu miauuuuuu";
    }
}