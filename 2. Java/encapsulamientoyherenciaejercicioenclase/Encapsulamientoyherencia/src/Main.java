import com.bootcamp.encapsulamiento.entidades.Cliente;
import com.bootcamp.encapsulamiento.entidades.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos", "34555"));
        personas.add(new Proveedor("Arcor", "345325", "dd"));

        for (Persona persona : personas) {
            System.out.println(persona.enviarMensaje());
        }
    }
}