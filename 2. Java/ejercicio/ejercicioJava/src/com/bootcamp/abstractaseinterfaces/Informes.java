package com.bootcamp.abstractaseinterfaces;

public class Informes extends Documento{

    private double longitud;
    private String cantPaginas;
    private String autor;
    private String revisor;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(String cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public Informes(String tipo, double longitud, String cantPaginas, String autor, String revisor) {
        super(tipo);
        this.longitud = longitud;
        this.cantPaginas = cantPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public Informes(String tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Informes{" +
                "longitud=" + longitud +
                ", cantPaginas='" + cantPaginas + '\'' +
                ", autor='" + autor + '\'' +
                ", revisor='" + revisor + '\'' +
                '}';
    }
}
