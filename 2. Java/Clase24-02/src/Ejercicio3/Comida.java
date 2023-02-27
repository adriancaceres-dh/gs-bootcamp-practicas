package Ejercicio3;

public interface Comida {

    public default void Comida(GustosAlimenticios e) {
        e.comerCarne();
    }
}
