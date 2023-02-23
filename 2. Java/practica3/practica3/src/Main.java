
import java.util.ArrayList;
import java.uti.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Mirko");
        System.out.println(nombres);
        for(String elemento:nombres){
            System.out.println(elemento);
        }

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Alguien");
        masNombres.add("Alguien mas");
        nombres.addAll(1,masNombres);

        System.out.println(nombres);

    }
}
