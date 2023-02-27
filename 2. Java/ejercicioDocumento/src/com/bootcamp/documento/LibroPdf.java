package com.bootcamp.documento;

public class LibroPdf implements Imprimible{
    private Integer paginas;
    private String nombreAutor;
    private String titulo;
    private String genero;

    @Override
    public void imprimir() {
        System.out.println("imprimir");
    }
}
