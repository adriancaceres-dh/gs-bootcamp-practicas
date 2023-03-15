import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guardarropa {
    int contador=1;
    Map<Integer, List<Prenda>> prendas =new HashMap<>();




    public Integer guardarPrenda(List<Prenda>listaPrendas){
        contador++;
        prendas.put(contador,listaPrendas);
        return contador;
    }

    //falta listar todas las prendas con un for
    public void mostrarPrendas(Integer id){
        System.out.println(prendas.get(id));
    }



}
