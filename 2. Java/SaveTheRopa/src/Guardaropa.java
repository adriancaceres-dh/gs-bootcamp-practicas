import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Guardaropa {

    int contador = 10;

    Map<Integer, List<Prenda>> prendas = new HashMap<>();

    public Integer guardarPrenda(List<Prenda> listaPrendas) {
        contador++;
        prendas.put(contador, listaPrendas);
        return contador;
    }
    //falta listar todas las prendas

    public void mostrarPrenda(Integer id) {
//        System.out.println(prendas.get(id));
        for (Map.Entry<Integer, List<Prenda>> entry : prendas.entrySet()) {
            System.out.println("Numero identificador: " + entry.getKey());
            for (Prenda prenda : entry.getValue()) {
                System.out.println("Marca: " + prenda.getMarca() + " - Modelo: " + prenda.getModelo());
            }
            System.out.println("-----------------------");
        }
    }
    public List<Prenda> devolverPrendas(Integer numero){
        List<Prenda> prendasADevolver = prendas.get(numero);
        prendas.remove(numero, prendas.get(numero));

        return prendasADevolver;
    }
    /*public List<Prenda> devolverPrendas(Integer numero) {
        return prendas.get(numero);
    }*/
}
