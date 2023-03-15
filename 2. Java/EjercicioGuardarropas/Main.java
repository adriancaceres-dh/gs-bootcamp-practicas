import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Prenda prenda=new Prenda("Nike", "Clasic");
        Prenda prenda1=new Prenda("Adidas", "Original");

        List<Prenda> prendas =new ArrayList<>();
        prendas.add(prenda);
        prendas.add(prenda1);

        Guardarropa guardarropa=new Guardarropa();

        Integer id = guardarropa.guardarPrenda(prendas);

        System.out.println(id);

        guardarropa.mostrarPrendas(id);
    }


}
