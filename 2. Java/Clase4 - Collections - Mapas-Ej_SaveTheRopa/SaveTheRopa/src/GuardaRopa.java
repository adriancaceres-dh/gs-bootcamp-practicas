import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    int contador = 1;
    int prenda= 0;
    Map<Integer, List<Prenda>> prendas = new HashMap<>();

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        contador++;
        prendas.put(contador, listaDePrendas);

        return contador;
    }
    public void mostrarPrenda(Integer id) {
        System.out.println(prendas.get(id));

        for (Map.Entry<Integer, List<Prenda>> prenda : prendas.entrySet()) {
            for (Prenda individual : prenda.getValue()) {
                System.out.println("GuardaRopas N°: " + prenda.getKey() + (id++) +
                        ", Prenda: " + individual.marca +
                        " " + individual.modelo);
            }

        }

    }

}