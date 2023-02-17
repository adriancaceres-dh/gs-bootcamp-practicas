import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Lucas");
        nombres.add("Pedro");
        nombres.add("Ayelen");
        nombres.add("Jesica");
        nombres.add("Camila");
        nombres.add("Martin");
        nombres.add("Lucio");
        nombres.add(0,"lucas");
        System.out.println(nombres);
        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        List<String> masNombres = new ArrayList<>();
        masNombres.add("Julieta");
        masNombres.add("Andrea");
        nombres.addAll(masNombres);
        System.out.println(nombres.contains("Juan")); // Para saber si esta en la lista. Devuelve un booleano
        System.out.println(nombres.indexOf("Juan")); // Devuelve la posicion.
        System.out.println(nombres.remove(nombres.indexOf("Juan"))); // ELimina del array el nombre seleccionado. Se pasa el index.
        System.out.println(nombres);
    }
}