package com.bootcamp.encampsulamiento.entidades;

public class Empleado  extends Persona{
    private String legajo;

    public Empleado(String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }

    @Override
    public void caminar() {
        System.out.println("no se que puso " + legajo);

    }
}
