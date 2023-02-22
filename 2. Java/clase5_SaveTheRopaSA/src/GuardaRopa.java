import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GuardaRopa {
    //ACTIVIDAD ANTES DE CLASES
    /*
    int contador = 0;
    Map<Integer, List<Prenda>> diccionario = new TreeMap<>();

    public Integer guardarPrendas(List<Prenda> listaDePrendas){
        diccionario.put(contador,listaDePrendas);
        return contador++;
    }

    public void mostrarPrendas(){
        for (Map.Entry<Integer,List<Prenda>> prenda : diccionario.entrySet()) {
            for (Prenda individual : prenda.getValue()){
                System.out.println("N° de GuardaRopas: " + prenda.getKey() +
                                    ", Prenda: " + individual.marca +
                                    " " + individual.modelo);
            }
        }
    }

    @Override
    public String toString() {
        return "GuardaRopa{" +
                "contador=" + contador +
                ", diccionario=" + diccionario +
                '}';
    }*/

    //ACTIVIDAD EN CLASES

    int contador =10;
    Map<Integer, List<Prenda>> prendas = new TreeMap<>();


    public Integer guardarPrendas(List<Prenda> listaDePrendas){
        contador++;
        prendas.put(contador,listaDePrendas);
        return contador;
    }

    //falta listar todas las prendas
    public void mostrarPrendas(Integer id){
        System.out.println(prendas.get(id));
    }


}


