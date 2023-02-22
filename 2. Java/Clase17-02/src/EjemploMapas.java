import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploMapas {
    public static void main(String[] args) {
        //TreeMap para que este ordenado, HashMap sale rapido pero desordenado
        Map<String,String> indice = new TreeMap<>();
        indice.put("Pag1", "Prologo");
        indice.put("Pag2", "Indice");
        indice.put("Pag3", "Capitulo1");
        indice.put("Pag4", "Bibliografia");

        System.out.println(indice.get("Pag4"));

        for (Map.Entry<String, String> pagina: indice.entrySet()) {
            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }

    }
}
