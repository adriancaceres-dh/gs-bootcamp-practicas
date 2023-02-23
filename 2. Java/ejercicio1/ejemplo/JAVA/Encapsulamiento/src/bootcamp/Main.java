package bootcamp;

import bootcamp.entidades.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cantidad de corazones " + Persona.cantidadDeCorazones);

        Persona persona = new Persona();
        persona.setNombre("Jesica");
        persona.setDni("35222425");

        System.out.println(persona);
    }
}