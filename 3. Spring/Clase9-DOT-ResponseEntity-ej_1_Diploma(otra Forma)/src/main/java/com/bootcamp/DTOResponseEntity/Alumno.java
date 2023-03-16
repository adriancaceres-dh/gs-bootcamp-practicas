package com.bootcamp.DTOResponseEntity;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Asignatura> asignaturasAprobadas;

    public Alumno(String nombre, List<Asignatura> asignaturasAprobadas) {
        this.nombre = nombre;
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    // getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }

    public void setAsignaturasAprobadas(List<Asignatura> asignaturasAprobadas) {
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Asignatura asignatura : asignaturasAprobadas) {
            sumaNotas += asignatura.getNota();
        }
        return sumaNotas / asignaturasAprobadas.size();
    }

}

