import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Map;

public class MainColeccioens {
    public static void main(String[] args) {

        List <String> listaPersonas = new ArrayList<String>(); // es una buena practica poner las listas en plural

        listaPersonas.add("Salva"); //solo puedo agergar Strings en este caso. //se agrega ultimo en posicion

        for(String nombre: listaPersonas){
            System.out.println(nombre);
        }

        List <String> listaPersonasLink = new LinkedList<>(); //es mas eficiente
        listaPersonasLink.add(0,"Alguien"); //podes elegir la posicion.
        listaPersonasLink.addAll(listaPersonas); //con esto le agregas otra coleccion a una coleccion
        System.out.println(listaPersonasLink);

        System.out.println(listaPersonasLink.get(1)); //les trae lo que haya en esa posicion
        System.out.println(listaPersonasLink.indexOf("Salva")); //trae la posicion


        Map<String,String> indiceLibro= new HashMap<>(); //en el HashMap no importa el orden, importa la velocidad
                                                        // para tenerlo ordenador usar el TreeMap
        indiceLibro.put("Pag1","Prologo");
        indiceLibro.put("Pag2","Indice");
        indiceLibro.put("Pag3","Capitulo1");
        indiceLibro.put("Pag4","Bibliografia");

        indiceLibro.put("Pag1","Salvador");

        System.out.println(indiceLibro.get("Pag1"));
        //parar rercorrer el map
        for(Map.Entry<String,String> pagina: indiceLibro.entrySet()){
            System.out.println(pagina.getValue()+" "+ pagina.getKey());
        }

    }
}
