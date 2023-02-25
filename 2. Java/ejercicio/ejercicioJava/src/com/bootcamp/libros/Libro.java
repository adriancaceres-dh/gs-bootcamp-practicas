package com.bootcamp.libros;

public class Libro {

    String titulo;
    String autor;
    String editorial;

    public String tituloYautorDelLibro() {
        return "Titulo " + titulo + " autor " + autor;
    }

    @Override
    public String toString() {
        return "com.bootcamp.libros.Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
    public Libro(){}

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
}
