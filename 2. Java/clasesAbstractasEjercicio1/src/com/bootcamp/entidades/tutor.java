package com.bootcamp.entidades;

public class tutor extends Estudiante implements EquipoDocente {

    @Override
    public void enseñar(){
        System.out.println("el tutor es un estudiante que enseña");
    }

    @Override
    public void darDevoluciones() {
        System.out.println("el tutor hace devoluciones");
    }

}
