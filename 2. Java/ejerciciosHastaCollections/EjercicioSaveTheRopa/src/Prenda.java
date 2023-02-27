import java.util.*;

class Prenda {
     String marca;
     String modelo;

    public Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return marca + " - " + modelo;
    }
}