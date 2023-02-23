import java.util.*;
public class GuardaRopa {
    int contador= 10;
    Map<Integer, List<Prenda>> prendas = new HashMap;

    public Integer guardarPrendas(List<Prenda> listaPrendas) {
        contador++;
        prendas.put(contador, listaPrendas);
        return contador;
    }

    //Falta listar todas las prendas.
    public void mostrarPrenda(Integer id){
        System.out.println(prendas.get(id));
    }

}
