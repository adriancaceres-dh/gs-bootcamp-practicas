import java.util.ArrayList;
import java.util.List;

public class ejemplosListas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Marcelo");
        System.out.println(nombres);
        for (String elemento: nombres){ // recorre la lista de nombres
            System.out.println(elemento);
        }
        nombres.add("Sol");
        System.out.println(nombres);
        nombres.add(0, "Maria"); // agrego un nombre para que aparezca como primer elemento de la lista
        System.out.println(nombres);

        List<String> masNombres = new ArrayList<>(); //agregamos otra lista a la primera
        masNombres.add("Alguien");
        masNombres.add("Alguien mas");
        nombres.addAll(1, masNombres);
        System.out.println(nombres);

        System.out.println(nombres.get(1)); // trae el elemento 1 de la lista
        System.out.println(nombres.indexOf("Juan")); // para saber la posicion del elemento en la lista
        System.out.println(nombres.remove(nombres.indexOf("Juan")));
    }
}
