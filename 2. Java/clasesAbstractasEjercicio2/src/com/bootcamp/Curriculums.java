package com.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Curriculums extends Documento implements Imprimir {

    private String nombre;
    private String Apellido;
    private String dni;
    private List<String> ListaDeHabilidad = new ArrayList<>();


    public Curriculums() {
        super();
    }

    public Curriculums(Integer cantidadDePaginas, String nombreAutor, String nombre, String apellido, String dni, List<String> listaDeHabilidad) {
        super(cantidadDePaginas, nombreAutor);
        this.nombre = nombre;
        Apellido = apellido;
        this.dni = dni;
        ListaDeHabilidad = listaDeHabilidad;
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir curriculims");
    }
}
