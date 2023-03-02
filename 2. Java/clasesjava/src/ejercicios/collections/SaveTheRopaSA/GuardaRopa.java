package ejercicios.collections.SaveTheRopaSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    //atributos
    Map<Integer, List<Prenda>> prendas = new HashMap<>();
    int contador = 1;


    //creamos un metodo que recibe como parametro una prenda y lo guarda en una lista
    public Integer guadarPrendas(List<Prenda> prendasAGuardar){
        //la llave es el contador, agregamos la prenda a la lista, aumentamos el contador y devolvemos el numero de la prenda
        contador++;;
        prendas.put(contador,prendasAGuardar);
        return contador;
    }


    //metodo que trae la lista de prenda segun el numero key que pongamos
    public List<Prenda> devolverPrenda(Integer id){

        List<Prenda> prendaBuscada = prendas.get(id);

        return prendaBuscada;
    }
}
