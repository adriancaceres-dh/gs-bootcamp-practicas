import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Prenda prenda1 = new Prenda("Marca1", "AA2");
        Prenda prenda2 = new Prenda("Marca5", "EE2");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda1);
        prendas.add(prenda2);

        Guardaropa guardaropa = new Guardaropa();
        Integer id = guardaropa.guardarPrenda(prendas);

        System.out.println("Las prendas se han guardado con el código " + id);

        guardaropa.mostrarPrenda(id);

        System.out.println("Las prendas a devolver son: " + guardaropa.devolverPrendas(id));
    }
}