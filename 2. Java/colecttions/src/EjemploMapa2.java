
import java.util.*;

public class EjemploMapa2 {
    public static void main(String[] args) {
        Map<String, List<String>> indice = new TreeMap<>();
        indice.put("Capitulo 1", List.of("Pagina 1", "Pagina 2", "Pagina 3"));
        indice.put("Capitulo 2", List.of("Pagina 4", "Pagina 5", "Pagina 6"));
        indice.put("Capitulo 3", List.of("Pagina 7", "Pagina 8", "Pagina 9"));
        indice.put("Capitulo 4", List.of("Pagina 10", "Pagina 11", "Pagina 12"));
        indice.put("Capitulo 5", List.of("Pagina 13", "Pagina 14", "Pagina 15"));

        indice.put("Autores", List.of("Borges","Cortazar"));

        // un mapa para cada circuito
        // datos de participantes dato de lista.
        //
        for (Map.Entry<String,List<String>> capitulo: indice.entrySet()) {
            System.out.println(capitulo.getKey() + " " + capitulo.getValue());
        }
    }
}
