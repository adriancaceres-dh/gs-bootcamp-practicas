package teoria.LambdaYWrapper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        /*int numero = Integer.parseInt("4");
        System.out.println(numero);

        String otroNumero = Integer.toString(5);
        System.out.println(otroNumero.getClass());

        Integer nuevoNumero = null;
        System.out.println(nuevoNumero);

        //variable primitiva
        double numerod = 10.0;

        // wrapper --> para poder usar todas sus funcionalidades
        Double numerodt = 18.0; */

        DesdeHasta<Integer, Integer> desdeHasta = new DesdeHasta<>();
        desdeHasta.setDesde(10);
        desdeHasta.setHasta(20);

        DesdeHasta<String, String> desdeHastaString = new DesdeHasta<>();
        desdeHastaString.setDesde("Alex");
        desdeHastaString.setHasta("Pedro");

        List<String> nombres = new ArrayList<>();

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2343,"Pedro"));
        personas.add(new Persona(23453,"Juana"));
        personas.add(new Persona(99999, "Carlos"));

        for (Persona persona: personas) {
            System.out.println(persona);
        }

        personas.forEach( persona -> System.out.println(persona) );

        // Quiero las personas con dni mayor a 50000
        List<Persona> personas1 = new ArrayList<>();
        for (Persona persona: personas) {
            if(persona.getDni()>50000) {
                personas1.add(persona);
            }
            System.out.println(persona);
        }
        for (Persona persona: personas1) {
            System.out.println(persona + " con dni mayor a 50000");
        }

        // personas con dni mayor a 50000
        personas.stream().filter(p -> p.getDni() > 50000).forEach(p -> System.out.println(p));

        // lista de personas ordenadas de mayor a menor
        personas.stream().sorted((p,q) -> p.getDni()>= q.getDni() ? -1:1 )
                .forEach(p -> System.out.println("orden dni" + p));

        // pasar la lista de personas a una lista de dni personas.




    }
}
