import java.util.*;
class GuardaRopa {
    int contador = 10;
    Map<Integer, List<Prenda>> prendas = new HashMap<>();


    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        contador++;
        prendas.put(contador, listaDePrenda);
        return contador;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entry : prendas.entrySet()) {
            System.out.println("Prendas bajo el identificador " + entry.getKey() + ": ");
            for (Prenda prenda : entry.getValue()) {
                System.out.println("- " + prenda);
            }
        }
    }

    public void mostrarPrenda(Integer id){
        System.out.println(prendas.get(id));
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return prendas.remove(numero);
    }
}


