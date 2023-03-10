import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    int contador;
    Map<Integer, List<Prenda>> prendas = new HashMap<>();
    public Integer guardarPrendas(List<Prenda> listaPrendas){
        contador ++;
        prendas.put(contador, listaPrendas);
    }
}