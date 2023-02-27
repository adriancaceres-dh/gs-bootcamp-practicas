package com.bootcamp.documento;

public class Informe implements Imprimible {
    private  String texto;
    private Integer cantidadDePagina;
    private String nombreDeAutor;
    private String revisor;
    @Override
    public void imprimir() {
        System.out.println("Imprimir informe");
    }
}
