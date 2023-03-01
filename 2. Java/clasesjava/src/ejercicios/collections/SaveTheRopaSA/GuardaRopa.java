package ejercicios.collections.SaveTheRopaSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    //variables
    private Map<Integer, List<Prenda>> diccionario = new HashMap<>();
    private Integer contador= 0;


    //creamos un metodo que recibe como parametro una prenda y lo guarda en una lista
    public Integer guadarPrendas(List<Prenda> prendasAGuardar){
        //la llave es el contador, agregamos la prenda a la lista, aumentamos el contador y devolvemos el numero de la prenda
        Integer key = contador;
        diccionario.put(key,prendasAGuardar);
        contador++;
        return key;

    }
}
