package com.bootcamp;

public class LibrosPDF extends Documento implements Imprimir {


    private String titulo;
    private String Genero;

    public LibrosPDF(){
        super();
    }

    public LibrosPDF(Integer cantidadDePaginas, String nombreAutor, String titulo, String genero) {
        super(cantidadDePaginas, nombreAutor);
        this.titulo = titulo;
        Genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir libros pdf");
    }
}
