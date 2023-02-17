import java.util.HashMap;
import java.util.Map;

public class EjemploMapas {
    public static void main(String[] args) {
        Map<String,String> indiceLibro = new HashMap<>(); //No tienen orden. Para que quede en orden necesita ser TreeMap.  Map<String,String> indiceLibro = new TreeMap<>();
        indiceLibro.put("Pag1", "Prologo");
        indiceLibro.put("Pag2", "Indice");
        indiceLibro.put("Pag3", "Capitulo 1");
        indiceLibro.put("Pag4", "Bibliografia");
        System.out.println(indiceLibro.get("Pag4"));
    for (Map.Entry<String, String> pagina : indiceLibro.entrySet()){
        System.out.println(pagina.getKey() + " " + pagina.getValue()); //No devuelve en orden la lista.
    }
    }
}
