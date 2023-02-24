package com.bootcamp.clasesAbstractas;

import org.w3c.dom.ls.LSOutput;

public class LibrosEnPdf extends Documentos implements Imprimible{
    private String titulo;
    private String genero;
    private String revisar;

    public LibrosEnPdf(){}
    public LibrosEnPdf(Integer cantidadDePaginas, String autor) {
        super(cantidadDePaginas, autor);
        this.titulo = titulo;
        this.genero = genero;
        this.revisar = revisar;
    }

    @Override
    public void imprimir() {
        System.out.println("Libro impreso.");
    }
}
