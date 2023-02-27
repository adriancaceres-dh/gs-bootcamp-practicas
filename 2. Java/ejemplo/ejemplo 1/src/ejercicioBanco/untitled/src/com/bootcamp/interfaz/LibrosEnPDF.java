package com.bootcamp.interfaz;

public class LibrosEnPDF extends Documento implements Imprimible {
    private Integer cantidadPaginas;
    private String autor;
    private String titulo;
    private String genero;

    public LibrosEnPDF(Integer cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }

    public LibrosEnPDF(){}

    @Override
    public void imprimir() {
        System.out.println("Imprimir libro");
    }
}
