import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GuardaRopa guardaRopa = new GuardaRopa();

        List<Prenda> prendas = new ArrayList<>();
        Prenda prenda1 = new Prenda("Adidas","Deportiva Argentina");
        Prenda prenda2 = new Prenda("Nike","Deportiva Barcelona");
        prendas.add(prenda1);
        prendas.add(prenda2);
        guardaRopa.guardarPrendas(prendas);

        List<Prenda> prendas1 = new ArrayList<>();
        Prenda prenda3 = new Prenda("Topper","Chomba Polo");
        Prenda prenda4 = new Prenda("KDY","Camiseta Colón");
        prendas1.add(prenda3);
        prendas1.add(prenda4);
        guardaRopa.guardarPrendas(prendas1);


        List<Prenda> prendas2 = new ArrayList<>();
        Prenda prenda5 = new Prenda("Umbro","Musculosa Argentina Básquet");
        Prenda prenda6 = new Prenda("Under","Gorra");
        prendas2.add(prenda5);
        prendas2.add(prenda6);
        guardaRopa.guardarPrendas(prendas2);


        guardaRopa.mostrarPrendas();





    }
}