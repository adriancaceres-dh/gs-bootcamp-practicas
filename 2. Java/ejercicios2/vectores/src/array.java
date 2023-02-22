import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("juan");
        nombres.add("mirko");
        System.out.println(nombres);

        for (String elementos : nombres){
            System.out.println(elementos);
        }
        nombres.add("erik");
        System.out.println(nombres);
        nombres.add(0, "maria");
        System.out.println(nombres);

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Alguien");
        masNombres.add("Alguien mas");
        nombres.addAll(1,masNombres);

        System.out.println(nombres);

    }
}
