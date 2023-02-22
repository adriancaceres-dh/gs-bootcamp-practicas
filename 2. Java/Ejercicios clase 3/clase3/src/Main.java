import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Jonatan");
        nombres.add("Jose");
        System.out.println(nombres);
        for (String elemento : nombres) {
            System.out.println(elemento);
        }
        nombres.add("Maximiliano");
        System.out.println(nombres);
        nombres.add(0, "Charly");
        System.out.println(nombres);

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Alguien");
        masNombres.add("Alguien mas");
        nombres.addAll(1, masNombres);

        System.out.println(nombres);

        System.out.println((nombres.get(1));
                System.out.println((nombres.indexOf("Jose"));


    }
}



