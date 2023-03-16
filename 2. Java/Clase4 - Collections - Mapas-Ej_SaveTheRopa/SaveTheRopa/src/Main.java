import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Prenda prenda = new Prenda ("Adidas", "AA2");
        Prenda prenda1 = new Prenda ("Nike", "EE3");
        Prenda prenda2 = new Prenda ("Reebok", "BB4");
        Prenda prenda3 = new Prenda ("Puma", "GG6");
        Prenda prenda4 = new Prenda ("Puma", "AG7");


        Prenda prenda5 = new Prenda ("Adidas", "AA2");
        Prenda prenda6 = new Prenda ("Nike", "EE3");
        Prenda prenda7 = new Prenda ("Reebok", "BB4");
        Prenda prenda8 = new Prenda ("Puma", "GG6");
        Prenda prenda9 = new Prenda ("Puma", "AG7");


        List<Prenda> prendas = new ArrayList<>();
        prendas.add(prenda);
        prendas.add(prenda1);
        prendas.add(prenda2);
        prendas.add(prenda3);
        prendas.add(prenda4);


        GuardaRopa guardaRopa = new GuardaRopa();
        Integer id = guardaRopa.guardarPrendas(prendas);

        guardaRopa.mostrarPrenda(id);

    }
}


