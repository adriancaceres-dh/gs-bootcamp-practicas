package com.bootcamp.clasesAbstractas;

public class Informes extends Documentos implements Imprimible{

    private String texto;

    public Informes(){}
    public Informes(Integer cantidadDePaginas, String autor) {
        super(cantidadDePaginas, autor);
       this.texto = texto;
    }



    @Override
    public void imprimir() {
        System.out.println("Informe impreso");
    }
}
