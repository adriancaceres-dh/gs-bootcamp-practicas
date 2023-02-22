import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ejemplo_Mapas {
    public static void main(String[] args) {

        // EJEMPLO 1
        System.out.println("EJEMPLO 1");
        System.out.println("------------");

        Map<String, String> indiceLibro = new TreeMap<>();
        indiceLibro.put("Pag1", "Prologo");
        indiceLibro.put("Pag2", "Indice");
        indiceLibro.put("Pag3", "Capitulo 1");
        indiceLibro.put("Pag4", "Bibliografía");

        System.out.println(indiceLibro.get("Pag4"));

        for (Map.Entry<String, String> pagina : indiceLibro.entrySet()) {
            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }

        System.out.println("");
        System.out.println("EJEMPLO 2");
        System.out.println("------------");


        Map<String, List<String>> indice = new TreeMap<>();

        indice.put("Cap1",List.of("Pag1","Pag2","Pag3"));
        indice.put("Cap2",List.of("Pag4","Pag5","Pag6"));
        indice.put("Cap3",List.of("Pag7","Pag8","Pag9"));

        indice.put("Autores",List.of("Borges"));

        for (Map.Entry<String,List<String>> capitulo: indice.entrySet()) {
            System.out.println(capitulo.getKey() + " " + capitulo.getValue());
        }
    }

}