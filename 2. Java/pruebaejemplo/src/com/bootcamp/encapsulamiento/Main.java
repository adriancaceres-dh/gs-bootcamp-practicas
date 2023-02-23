package com.bootcamp.encapsulamiento;

import com.bootcamp.encapsulamiento.entidades.Cliente;
import com.bootcamp.encapsulamiento.entidades.Persona;

public class Main {
    public static void main(String[] args) {

        System.out.println(Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setDni("4005221");

        System.out.println(persona);

        Cliente cliente = new Cliente("juan", "40523654");


    }
}