import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ACTIVIDAD ANTES DE CLASES

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

        //Elimino las prendas en el guardaRopas indicado en el parametro.
        System.out.println("Las prendas a devolver son: " + guardaRopa.devolverPrendas(1));
        //Vuelvo a mostrar el listado de guardaRopas con sus respectivas prendas.
        guardaRopa.mostrarPrendas();


        //ACTIVIDAD EN CLASES

        /*Prenda prenda = new Prenda("Marca1", "AA2");
        Prenda prenda1 = new Prenda("Marca2", "AA5");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda);
        prendas.add(prenda1);

        GuardaRopa guardaRopa = new GuardaRopa();
        Integer id = guardaRopa.guardarPrendas(prendas);

        System.out.println(id);
        guardaRopa.mostrarPrendas(11);*/


    }
}