package com.bootcamp.entidades;

public class Tutor extends Estudiante implements EquipoDocente{

    public void enseñar() {
        System.out.println("El tutor es un estudiante que enseña");
    }

    @Override
    public void darDevoluciones() {

    }

}
