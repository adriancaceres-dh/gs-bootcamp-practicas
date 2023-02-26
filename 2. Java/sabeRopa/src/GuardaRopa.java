import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    int contador = 0;
    Map<Integer, List<Prenda>> prendas = new HashMap<>();

    public Integer guardarPrenda(List<Prenda> listaPrendas){
        contador++;
        prendas.put(contador, listaPrendas);
        return contador;

    }

    public void mostrarPrenda(Integer id){
        System.out.println("hello world");
    }
}
