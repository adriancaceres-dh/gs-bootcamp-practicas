import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Prenda prenda = new Prenda("Marca1", "AA2");
        Prenda prenda1 = new Prenda("Marca5", "EE2");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda);
        prendas.add(prenda1);

        GuardarRopa guardarRopa = new GuardarRopa();
        Integer id = guardarRopa.guardarPrenda(prendas);

        System.out.println(id);

        guardarRopa.mostrarPrenda(id);

    }
}

// Ejercicio no finalizado