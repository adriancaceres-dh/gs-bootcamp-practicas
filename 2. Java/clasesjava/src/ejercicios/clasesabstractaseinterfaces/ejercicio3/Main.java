package ejercicios.clasesabstractaseinterfaces.ejercicio3;

public class Main {
    public static void main(String[] args){
        Animal perro = new Perro();
        perro.emitirSonido();

        Animal gato = new Gato();
        gato.emitirSonido();

        Animal vaca = new Vaca();
        vaca.emitirSonido();



    }
}
