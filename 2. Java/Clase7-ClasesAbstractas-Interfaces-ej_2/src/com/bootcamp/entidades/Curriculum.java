package com.bootcamp.entidades;
import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Documento implements Imprimible{

    private String nombre;
    private String apellido;

    private List<String> habilidades =  new ArrayList<>();

    public Curriculum(){
        super();
    }

    public Curriculum(Integer cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }


    @Override
    public void imprimir() {
        System.out.println("Curriculum impreso");
    }
}