import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ejemploMapa {
    public static void main(String[] args) {

        Map<String, String> indiceLibro = new TreeMap<>();// HashMap<>(); -> sin ordenar
        indiceLibro.put("Pag1", "Prologo");
        indiceLibro.put("Pag2", "Indice");
        indiceLibro.put("Pag3", "Capitulo1");
        indiceLibro.put("Pag4", "Bibliografia");

        System.out.println(indiceLibro.get("Pag4"));

        for (Map.Entry<String, String> pagina: indiceLibro.entrySet()) {
            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }
    }
}
