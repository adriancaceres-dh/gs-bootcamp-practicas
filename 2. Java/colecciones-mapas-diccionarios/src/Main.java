import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Mirko");
        System.out.println(nombres);
        for (String elemento: nombres) {
            System.out.println(elemento);
        }
        nombres.add("Erik");
        System.out.println(nombres);
        nombres.add(0, "Maria");
        System.out.println(nombres);

        List<String> masNombres = new ArrayList<>();
        masNombres.add("ALguien");
        masNombres.add("Alguien mas");
        nombres.addAll(1, masNombres);
        System.out.println(nombres);


    }
}