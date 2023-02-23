package sancor.bootcamp;

import sancor.bootcamp.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("cantidad de corazones " +  Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("nicolas");
        persona.setDni("34433343");

        System.out.println(persona);


        Cliente cliente = new Cliente(" leo", "332244" );
        cliente.setNumeroCliente("345525");
        System.out.println(cliente);

    }
}