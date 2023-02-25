import animales.Gato;
import animales.Perro;
import animales.Vaca;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        perro.emitirSonidoPerro();
        gato.emitirSoniadoGato();
        vaca.emitirSonidoVaca();

    }
}