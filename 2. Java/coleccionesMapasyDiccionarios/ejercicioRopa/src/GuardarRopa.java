import java.util.HashMap;

public class GuardarRopa {
    int contador = 10;
    Map<Integer,List<Prenda>> prendas = new HashMap<>();

    public Integer guardarPrenda(List<Prenda> listaPrendas) {
        contador++;
        prendas.put(contador,listaPrendas);
        return contador;
    }

    // falta listar todas las prendas

    public void mostrarPrenda(Integer id) {
        System.out.println(prendas.get(id));
    }



    }