import java.util.*;

//listas
public class Main {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Nico");
        nombres.add("Juan Martin");
        nombres.add("Valentin");
        nombres.add("Victoria");
        System.out.println(nombres);

        for (String elemento: nombres) {
            System.out.println(elemento);
        }
        nombres.add(0, "Marcela");
        System.out.println(nombres);


        List<String> masNombres = new ArrayList<>();
        masNombres.add("otro");
        masNombres.add("Batata");
        nombres.addAll(1,masNombres);

        System.out.println(nombres);

        // Mapas equivalente a object de js
        Map<String, String> indiceLibro = new TreeMap<>();
        indiceLibro.put("Pag1","Prologo");
        indiceLibro.put("Pag2","Indice");
        indiceLibro.put("Pag3","Capitulo1");
        indiceLibro.put("Pag4","Bibliografia");

        System.out.println(indiceLibro.get("Pag3"));

        for (Map.Entry<String,String> pagina: indiceLibro.entrySet()) {
            System.out.println(pagina.getKey()+ " " +pagina.getValue());
        }
        Map<String, List<String>> indice = new TreeMap<>();

        indice.put("Cap1",List.of("Pag1","Pag2","Pag3"));
        indice.put("Cap2",List.of("Pag4","Pag5","Pag6"));
        indice.put("Cap3",List.of("Pag7","Pag8","Pag9"));

        indice.put("Autores",List.of("Borges",""));

        for (Map.Entry<String,List<String>> capitulo: indice.entrySet()) {
            System.out.println(capitulo.getKey() + " " + capitulo.getValue());
        }

    }
}