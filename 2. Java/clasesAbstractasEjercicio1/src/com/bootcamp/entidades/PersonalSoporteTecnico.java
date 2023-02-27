package com.bootcamp.entidades;

public class PersonalSoporteTecnico extends Persona implements EquipoTecnico{
    @Override
    public void darSoporteTecnico() {
        System.out.println("soporte tecnico");
    }
}
