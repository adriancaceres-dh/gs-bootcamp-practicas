import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*System.out.println(Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setDni("26245927");

        System.out.println(persona);

        Cliente cliente = new Cliente("Juana", "546546");
        cliente.setNumeroCliente("A65814");

        System.out.println(cliente);*/

        List<Persona> personas = new ArrayList<>();
        personas.add(new Cliente("Carlos", "34650741"));
        personas.add(new Proveedor("ARCOR", "465466546", "AB216514"));

        for (Persona persona: personas) {
            System.out.println(persona.enviarMensaje());
        }
    }
}
