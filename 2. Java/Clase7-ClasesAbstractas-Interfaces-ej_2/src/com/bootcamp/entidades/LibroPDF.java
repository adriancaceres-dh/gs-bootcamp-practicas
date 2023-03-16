package com.bootcamp.entidades;

public class LibroPDF extends Documento implements Imprimible{

   private String titulo;

    private String genero;

    public LibroPDF(){}

    public LibroPDF(Integer cantidadDePaginas, String nombreAutor, String titulo, String genero) {
        super(cantidadDePaginas, nombreAutor);
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public void imprimir() {

        System.out.println("Imprimir libros en pdf");
    }
}