package com.bootcamp.personas;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersonas {
    int cantidad;
    String ciudad;
    List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public String listarPersonas() {
        String listarPersonas = "";
        for (Persona persona: personas) {
            // System.out.println(libro.toString());
            listarPersonas = listarPersonas + "\n" + persona.toString();
        }
        return listarPersonas;
    }
}
