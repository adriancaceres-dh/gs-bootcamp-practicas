package com.bootcamp.entidades;

public class Informe extends Documento implements Imprimible{

    private String texto;

    private String revisor;

    public Informe(){}

    public Informe(Integer cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }


    @Override
    public void imprimir() {

        System.out.println("imprimir informes");

    }


}