import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class GuardaRopa {
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



    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> prendasADevolver = diccionario.get(numero);
        diccionario.remove(numero, diccionario.get(numero));

        return prendasADevolver;
    }

    @Override
    public String toString() {
        return "GuardaRopa{" +
                "contador=" + contador +
                ", diccionario=" + diccionario +
                '}';
    }


}
