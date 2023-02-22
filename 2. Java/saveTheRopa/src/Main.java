import java.util.ArrayList;
import java.util.List;

public class Main {
   Prenda prenda = new Prenda ("Marca1, "AA2"");
    Prenda prenda1 = new Prenda ("Marca2, "AA3"");

    List<Prenda>prendas = new ArrayList<>();
    prenda.add(prenda);
    prenda.add(prenda1);

    Guardarropa guardarropa = new Guardarropa();
    Integer id = guardarropa.guardarPrendas(prendas);

    System.out.println(id);

    public Guardarropa getGuardarropa() {
        return guardarropa;
    }
}