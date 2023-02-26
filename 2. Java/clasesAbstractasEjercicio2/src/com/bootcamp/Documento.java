package com.bootcamp;

public abstract class Documento {

    public Integer cantidadDePaginas;

    protected String nombreAutor;


    public Documento() {}

    public Integer getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(Integer cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public Documento(Integer cantidadDePaginas, String nombreAutor) {
        this.cantidadDePaginas = cantidadDePaginas;
        this.nombreAutor = nombreAutor;







    }
}
