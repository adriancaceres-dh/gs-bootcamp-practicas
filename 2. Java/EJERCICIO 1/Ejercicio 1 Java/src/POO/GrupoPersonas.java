package POO;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersonas {
    int cantidad;
    String ciudad;
   List<PersonaPooEjercicios> personas = new ArrayList<>();

    public void agregarPersona(PersonaPooEjercicios persona) {
        personas.add(persona);
    }

    public String listarPersonas() {
        String listarPersonas = "";
        for (PersonaPooEjercicios persona: personas) {
            // System.out.println(libro.toString());
            listarPersonas = listarPersonas + "\n" + persona.toString();
        }
        return listarPersonas;
    }
}
