import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
public class EjemploMapa {
    public static void main(String[] args) {
        Map<String,List<String>> indice = new TreeMap<>();

        indice.put("Cap1",List.of("Pag1","Pag2", "Pag3"));
        indice.put("Cap2",List.of("Pag1","Pag2", "Pag3"));
        indice.put("Cap3",List.of("Pag1","Pag2", "Pag3"));

        indice.put("Autores",List.of("Borges","Marquez"));

        for (Map.Entry<String, List<String>> capitulo: indice.entrySet()) {
            System.out.println(capitulo.getKey()+" "+capitulo.getValue());
        }

    }
}
