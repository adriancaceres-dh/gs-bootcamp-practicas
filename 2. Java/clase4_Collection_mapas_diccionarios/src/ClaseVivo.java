import java.util.*;

public class ClaseVivo {

    public static void main(String[] args) {

        //LIST

       /* List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Sofia");
        nombres.add(0,"Lucho");

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Lucas");
        masNombres.add("Marcela");
        nombres.addAll(masNombres);

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println(nombres.get(1)); */


        //MAPS

        /*Map<String,String> indice = new TreeMap<>();

        indice.put("Pag1","Prologo");
        indice.put("Pag2","Indice");
        indice.put("Pag3","Capitulo1");
        indice.put("Pag4","Bibliografia");

        System.out.println(indice.get("Pag1"));

        //NO SALE ORDENADA CON HASHMAP - PARA ELLOS USAMOS TREEMAP
        for(Map.Entry<String,String> pagina : indice.entrySet()){
            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }*/

        //EJEMPLO MAPA 2

        /*Map<String, List<String>> indice = new TreeMap<>();

        indice.put("Cap1", List.of("Pag1","Pag2","Pag3"));
        indice.put("Autores", List.of("Borges","Lucho"));

        for(Map.Entry<String,List<String>> capitulo : indice.entrySet()){
            System.out.println(capitulo.getKey() + " " + capitulo.getValue());
        }

        String valorTomado = indice.get("Cap1").get(0);
        System.out.println(valorTomado);

        /*Map <String, Map<String,List<String>>> indices = new HashMap<>();*/

    }

}
