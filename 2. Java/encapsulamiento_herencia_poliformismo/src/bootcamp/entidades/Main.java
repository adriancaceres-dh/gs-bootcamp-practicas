package bootcamp.entidades;

import bootcamp.entidades.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Nicolas");
        persona.setDni("35637064");

        System.out.println(persona);

        Cliente cliente = new Cliente
                ("Pedro", "29601705");


    }
}