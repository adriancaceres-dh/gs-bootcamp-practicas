import java.util.ArrayList;
import java.util.List;

public class ejArrayList {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Mirko");
        System.out.println(nombres);

        for (String elemento: nombres){
            System.out.println(elemento);
        }
        nombres.add("Erik");
        System.out.println(nombres);

        //al ingresarlo así, se agrega en la primera posición, ya que le colocamos índice 0
        nombres.add(0, "María");
        System.out.println(nombres);
    }
}

//Siempre que agreguemos un nombre, se agregará en la última posición