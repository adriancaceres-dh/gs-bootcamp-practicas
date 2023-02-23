import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Prenda prenda1 = new Prenda("Marca1", "AA1");
        Prenda prenda2= new Prenda("Marca2", "AA2");
        Prenda prenda3 = new Prenda("Marca3", "AA3");
        Prenda prenda4 = new Prenda("Marca4", "AA4");
        Prenda prenda5 = new Prenda("Marca5", "AA5");
        Prenda prenda6 = new Prenda("Marca6", "AA6");
        Prenda prenda7 = new Prenda("Marca7", "AA7");
        Prenda prenda8 = new Prenda("Marca8", "AA8");

        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda1);
        prendas.add(prenda2);
        prendas.add(prenda3);
        prendas.add(prenda4);
        prendas.add(prenda5);
        prendas.add(prenda6);
        prendas.add(prenda7);
        prendas.add(prenda8);
    }
    GuardaRopa guardaRopa = new GuardaRopa();
    Integer id = guardaRopa.guardarPrendas(prendas);


}