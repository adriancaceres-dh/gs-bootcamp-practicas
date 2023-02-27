package com.bootcamp.entidades;

public class EstudianteTecnico extends Estudiante implements EquipoTecnico {

    public void colaborar(){
        System.out.println("Hace las tareas con soporte tecnico");
    }

    @Override
    public void darSoporteTecnico() {
        System.out.println("Dar soporte tecnico");
    }
}
