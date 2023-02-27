package com.bootcamp.interfaz;

public class Informes extends Documento implements Imprimible {
    private String texto;
    private Integer cantPag;
    private String autor;
    private String revisor;

    public Informes(Integer cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }

    public Informes(){}

    @Override
    public void imprimir() {
        System.out.println("Imprimir informes");
    }
}
