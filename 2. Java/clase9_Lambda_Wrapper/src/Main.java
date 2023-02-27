import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CLASES GENERICAS
        /*
        DesdeHasta<Integer,String> desdeHasta = new DesdeHasta<>();
        desdeHasta.setDesde(10);
        desdeHasta.setHasta("Chau");
        DesdeHasta<Integer,Integer> desdeHastaInt = new DesdeHasta<>();
        desdeHastaInt.setDesde(10);
        desdeHastaInt.setHasta(20);
        */

        //STREAMS -> FORMA DE RECORRER UNA COLECCION

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Gisela",36365939));
        personas.add(new Persona("Maria",37258939));
        personas.add(new Persona("Marce",12225887));

        //Antes
        List<Persona> personas1 = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona.getDni() > 35000000){
                personas1.add(persona);
            }
        }
        System.out.println(personas1);

        //Con STREAMS
        personas.forEach( persona -> System.out.println(persona.getNombre()));

        personas.stream().filter(p -> p.getDni() > 35000000).forEach(p-> System.out.println(p));

        //Ordena los elementos
        personas.stream().sorted((p,q) -> p.getDni() >= q.getDni() ? 1 : -1)
                .forEach(p -> System.out.println(p));


        //CODIGO PROFE
        /*
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2343,"Pedro"));
        personas.add(new Persona(23453,"Juana"));
        personas.add(new Persona(99999, "Carlos"));
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
        // pasar la lista de personas a una lista de dni
        personas.stream().mapToInt( p -> p.getDni()).forEach(e-> System.out.println(e));
        // suma de los dni
        System.out.println(personas.stream().mapToInt( p -> p.getDni()).sum()) ;
        */
    }
}