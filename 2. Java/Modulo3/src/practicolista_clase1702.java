import java.util.ArrayList;
import java.util.List;

public class practicolista_clase1702 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Mirko");
        System.out.println(nombres);
            for(String elemento: nombres){
                System.out.println(elemento);
        }
        nombres.add("Erik");
        System.out.println(nombres);
        nombres.add(0,"Maria");
        System.out.println(nombres);
    }
}
