import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Prenda prenda = new Prenda("Marca1", "AA2");
        Prenda prenda1 = new Prenda("Marca2", "AA3");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda);
        prendas.add(prenda1);

        GuardaRopa guardaRopa = new GuardaRopa();
        Integer id = guardaRopa.guardarPrendas(prendas);

        System.out.println(id);
        guardaRopa.mostrarPrenda(id);
    }
}