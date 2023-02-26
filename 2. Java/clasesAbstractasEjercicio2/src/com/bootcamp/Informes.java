package com.bootcamp;

public class Informes extends Documento implements Imprimir{

    private String longitud;
    private String revisor;

    public Informes(){
        super();
    }

    public Informes(Integer cantidadDePaginas, String nombreAutor, String longitud, String revisor) {
        super(cantidadDePaginas, nombreAutor);
        this.longitud = longitud;
        this.revisor = revisor;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir informes");
    }
}
