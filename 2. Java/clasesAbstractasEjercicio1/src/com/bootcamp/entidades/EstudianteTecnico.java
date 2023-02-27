package com.bootcamp.entidades;

public class EstudianteTecnico extends Estudiante implements EquipoTecnico{

    public void colaborar(){
        System.out.println("Hace las tarea con soporte tecnico");
    }

    @Override
    public void darSoporteTecnico() {
        System.out.println("dar soporte tecnico");
    }
}
