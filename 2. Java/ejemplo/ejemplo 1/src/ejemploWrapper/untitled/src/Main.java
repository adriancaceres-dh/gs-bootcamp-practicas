import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2312, "Pedro"));
        personas.add(new Persona(3343, "Juana"));
        personas.add(new Persona(4345, "Carlos"));

        List<Persona> personas1 = new ArrayList<>();
        for (Persona persona: personas){
            if (persona.getDni() > 4000){
                personas1.add(persona);
            }
            System.out.println(persona);
        }
        for (Persona persona: personas1){
            System.out.println(persona + " Con DNI mayor a 4000");
        }

        personas.stream().filter(p -> p.getDni() > 4000).forEach(p -> System.out.println(p));

        personas.stream().sorted((p,q) -> p.getDni()>= q.getDni() ? 1:-1)
                .forEach(p -> System.out.println(p));

        personas.stream().mapToInt(p -> p.getDni()).forEach(e-> System.out.println(e));
        System.out.println(personas.stream().mapToInt(p -> p.getDni()).sum());



        // personas.forEach( persona -> System.out.println(persona));

        /*
        DesdeHasta<Integer,Integer> desdeHasta = new DesdeHasta<>();
        desdeHasta.setDesde(10);
        desdeHasta.setHasta(20);

        DesdeHasta<String, String> desdeHastaString = new DesdeHasta<>();
        desdeHastaString.setDesde("Alex");
        desdeHastaString.setHasta("Pedro");

        List<String> nombre = new ArrayList<>();
        */

        /*
        int numero = Integer.parseInt("4");
        System.out.println(numero);

        String otroNumeroString = Integer.toString(5);
        System.out.println(otroNumeroString);

        Integer nuevoNumero = null;
        System.out.println(nuevoNumero);

        System.out.println(otroNumeroString.getClass());

        double numerod = 10.0;
        Double numerodt = 10.0;
        */

    }
}