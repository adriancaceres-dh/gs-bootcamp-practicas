package com.bootcamp.EjercicioObtenerDiploma;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Asignatura> lista = new ArrayList<>();

    public Alumno(String nombre, List<Asignatura> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getLista() {
        return lista;
    }

    public void setLista(List<Asignatura> lista) {
        this.lista = lista;
    }
}
