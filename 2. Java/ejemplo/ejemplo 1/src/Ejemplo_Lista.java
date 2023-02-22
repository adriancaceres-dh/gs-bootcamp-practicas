import java.util.ArrayList;
import java.util.List;

public class Ejemplo_Lista {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Fran");
        nombres.add("Stefa");

        for (String nombre: nombres){
            System.out.println(nombre);
        }
        nombres.add("Anto");
        System.out.println(nombres);
        nombres.add(0,"Tizi");
        System.out.println(nombres);

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Alguien");
        masNombres.add("Alguien más");
        nombres.addAll(1, masNombres);

        System.out.println(nombres);
    }
}
