import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guardarropa {

    int contador;
    Map<Integer, List<Prenda>> prendas= new HashMap<>();

    public Integer guardarPrendas(List<Prenda> listaPrendas){
        contador++;
        prendas.put(contador,listaPrendas);
        return contador;
    }

    //falta listar todas las prendas
    public mostrarPrendas(Integer id){
        System.out.println(prendas.get(id));
    }

}
