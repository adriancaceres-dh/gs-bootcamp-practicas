package com.bootcamp.abstractaseinterfaces;

public class Pdf extends Documento {
    private double cantidadPaginas;
    private String nombreAutor;
    private String titulo;
    private String genero;

    public double getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(double cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Pdf(String tipo) {
        super(tipo);
    }

    public Pdf(String tipo, Double cantidadPaginas, String nombreAutor, String titulo, String genero) {
        super(tipo);
        this.cantidadPaginas = cantidadPaginas;
        this.nombreAutor = nombreAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pdf{" +
                "cantidadPaginas=" + cantidadPaginas +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
