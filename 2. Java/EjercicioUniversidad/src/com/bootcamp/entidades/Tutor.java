package com.bootcamp.entidades;

public class Tutor extends Estudiante implements EquipoDocente{

    //Son estudiantes que se eligieron para enseñar algo.
    public void ensenar(){
        System.out.println("El tutor es un estudiante que enseña.");
    }

    @Override
    public void enseñar() {
        System.out.println("Enseña en conjunto con el profesor");
    }

    @Override
    public void darDevoluciones() {
        System.out.println("Ayuda con las devoluciones");
    }
}
