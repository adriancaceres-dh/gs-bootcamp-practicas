package com.bootcamp.entidades;

public class EstudianteTecnico extends Estudiante implements EquipoTecnico{
    public void colaborar(){
        System.out.println("El estudiante técnico colabora con el soporte técnico");
    }

    @Override
    public void darSoporteTecnico() {
        System.out.println("Dar soporte técnico");
    }
}