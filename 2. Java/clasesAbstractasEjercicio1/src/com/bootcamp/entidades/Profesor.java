package com.bootcamp.entidades;

public class Profesor extends Persona implements EquipoDocente{
    @Override
    public void enseñar() {
        System.out.println("Dar el curso");
    }

    @Override
    public void darDevoluciones() {
        System.out.println("Dar devoluciones");
    }
}
