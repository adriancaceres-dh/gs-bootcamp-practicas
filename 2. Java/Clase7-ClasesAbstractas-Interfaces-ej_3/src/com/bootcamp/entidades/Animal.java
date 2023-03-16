package com.bootcamp.entidades;

public abstract class Animal {
    private String nombre;
    private String raza;
    private int miembros;

    public Animal () {}

    public Animal(String nombre, String raza, int miembros) {
        this.nombre = nombre;
        this.raza = raza;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    public abstract String emitirSonido();


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", miembros=" + miembros +
                '}';
    }
}
