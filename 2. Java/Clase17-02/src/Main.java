import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ximena");
        nombres.add("Ludmila");
        System.out.println(nombres);

        for (String elemento: nombres) {
            System.out.println(elemento);
        }
        nombres.add("Erik");
        System.out.println(nombres);
        nombres.add(0, "Maria");
        System.out.println(nombres);

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Alguien");
        masNombres.add("Alguien mas");
        nombres.addAll(1, masNombres);

        System.out.println(nombres);
        System.out.println(nombres.get(2));
        System.out.println(nombres.indexOf("Ximena"));
        System.out.println(nombres.remove(nombres.indexOf("Maria")));


    }
}