package Ejercicio2;

public interface Imprimible {
    static void imprimir(Documento documento) {
        System.out.println(documento.getContenido());
    }
}
