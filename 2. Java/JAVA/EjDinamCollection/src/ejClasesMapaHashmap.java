import java.util.HashMap;
import java.util.Map;

public class ejClasesMapa {
    public static void main(String[] args) {

        Map<String,String> indiceLibro = new HashMap<>();
        indiceLibro.put("Pag1","Prologo");
        indiceLibro.put("Pag2","Indice");
        indiceLibro.put("Pag3","Capítulo1");
        indiceLibro.put("Pag4","Bibliografía");

       // System.out.println(indiceLibro.get("Pag4"));

        for (Map.Entry<String, String> pagina: indiceLibro.entrySet()){
            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }
    }
}
