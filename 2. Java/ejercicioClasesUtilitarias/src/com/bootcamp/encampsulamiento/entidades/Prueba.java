package com.bootcamp.encampsulamiento.entidades;

import java.util.Collection;

public class Prueba {

    private Integer dni;
    private String nombre;

    public Prueba(Integer dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
