import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Creamos dos prendas y las guardamos en una lista
        Prenda prenda1 = new Prenda("Adidas", "Camiseta");
        Prenda prenda2 = new Prenda("Nike", "Shorts");

        List<Prenda> prendasAGuardar = new ArrayList<>();
        prendasAGuardar.add(prenda1);
        prendasAGuardar.add(prenda2);

        // Creamos un objeto GuardaRopa
        GuardaRopa guardaRopa = new GuardaRopa();

        // Guardamos las prendas y obtenemos el número identificador
        Integer id = guardaRopa.guardarPrendas(prendasAGuardar);

        // Mostramos las prendas que quedaron guardadas
        System.out.println("Prendas guardadas:");
        guardaRopa.mostrarPrendas();

        // Reclamamos las prendas utilizando el número identificador
        List<Prenda> prendasRecuperadas = guardaRopa.devolverPrendas(id);

        // Mostramos las prendas que fueron recuperadas
        System.out.println("Prendas reclamadas:");
        for (Prenda prenda : prendasRecuperadas) {
            System.out.println("- " + prenda);
        }

        // Mostramos las prendas restantes en el GuardaRopa
        System.out.println("Prendas restantes:");
        guardaRopa.mostrarPrendas();
    }
}