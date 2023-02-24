package com.bootcamp.clasesAbstractas;

import javax.swing.text.Document;

public abstract class Documentos {
    protected Integer cantidadDePaginas;

    protected String autor ;

    public Documentos(){}
    public Documentos(Integer cantidadDePaginas, String autor) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.autor = autor;
    }
}
