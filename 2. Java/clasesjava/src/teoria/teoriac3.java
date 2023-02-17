package teoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class teoriac3 {
    public static void main(String[] args){

        //creamos la lista, y se puede agrgar sacar elementos
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Mirko");
        nombres.add(0,"Maria"); //aclara en que posicion agregamos el elemento

        //System.out.println(nombres);

        for (String elemento: nombres){
            //System.out.println(elemento);
        }

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Alguien");
        nombres.addAll(1,masNombres); // agregamos una coleccion entera

        //System.out.println(nombres.get(2)); //trae el elemento en posicion 2
        //System.out.println(nombres.indexOf("Juan"));// trae la posicion del elemento indicado

        //EJEMPLO MAPAS

        Map<String, String> indice = new HashMap<>();
        indice.put("Pag1", "Prologo");
        indice.put("Pag2", "Indice");
        indice.put("Pag3", "Capitulo1");
        indice.put("Pag4", "Bibliografia");

        //System.out.println(indice.get("Pag4"));

        for (Map.Entry<String,String> pagina: indice.entrySet()){
            System.out.println(pagina.getKey() + " " + pagina.getValue());
        }
    }
}