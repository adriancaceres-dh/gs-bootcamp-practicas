import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ExprecionesLambda> personas1 = new ArrayList<>();
        personas1.add(new ExprecionesLambda(401231, "Salvador"));
        personas1.add(new ExprecionesLambda(401231, "Juan"));


        personas1.forEach(persona2-> System.out.println(persona2)); //Exprecion Labmda es como una arrow



    }









}
