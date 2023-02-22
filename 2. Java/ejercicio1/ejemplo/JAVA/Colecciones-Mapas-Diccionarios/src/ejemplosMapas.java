import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ejemplosMapas {
    public static void main(String[] args) {
        Map<String,String> indiceLibro = new HashMap<>(); //no ordena el mapa, es mas rapido
        /*Map<String,String> indiceLibro = new TreeMap<>();*/ // con los <> indicamos los tipos de datos, ordena el mapa
        indiceLibro.put("pag1", "Prologo");
        indiceLibro.put("pag2", "Indice");
        indiceLibro.put("pag3", "Capitulo1");
        indiceLibro.put("pag4", "Bibliografia");

        System.out.println(indiceLibro.get("pag4")); //buscamos en el mapa con get

        for (Map.Entry<String,String> pagina:indiceLibro.entrySet()){ //recorremos el mapa
            System.out.println(pagina.getKey() + " " + pagina.getValue()); //no garantiza el orden
        }
    }
}
