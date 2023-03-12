package ejercicios.clasesabstractaseinterfaces.animales;

public class Perro extends Animal implements Carnivoro{

    public Perro(){

    }

    //constructor heredado de Animal
    public Perro(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public String emitirSonido() {
       return "Guau Guau";
    }

    @Override
    public String comerCarne() {
        return "El perro come carne";
    }
}
