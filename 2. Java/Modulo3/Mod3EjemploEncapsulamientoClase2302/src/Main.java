import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println(Persona.cantidadCorazones);

        Persona persona= new Persona();
        persona.setNombre("Carlos");
        persona.setDni("45646413");

        System.out.println(persona);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos","34555"));
        personas.add(new Proveedor("Arcor","345325","dd"));

        for (Persona persona: personas ) {
            System.out.println(persona.enviarMensaje());
        }
    }
}