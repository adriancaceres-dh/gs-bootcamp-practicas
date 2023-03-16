package com.bootcamp.entidades;

public class Profesor extends Persona implements EquipoDocente{

    @Override
    public void ensenar() {
        System.out.println("Dar curso");
    }

    @Override
    public void darDevoluciones() {
        System.out.println("Generar devoluciones");
    }
}