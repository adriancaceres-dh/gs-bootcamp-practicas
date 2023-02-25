package com.bootcamp.abstractaseinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Documento{
    private String nombre;
    private int edad;
    private int dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Curriculum(String tipo, String nombre, int edad, int dni) {
        super(tipo);
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                '}';
    }

    public Curriculum(String tipo) {
        super(tipo);
    }

    List<Curriculum> curriculumList = new ArrayList<>();
    public void administrarCv(Curriculum cv) {
        curriculumList.add(cv);
    }

}
