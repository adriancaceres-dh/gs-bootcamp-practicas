import java.util.ArrayList;

public class Curriculum implements Imprimir {

    ArrayList<String> persona;

    public Curriculum(ArrayList<String> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "persona=" + persona +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo curriculum: " + persona.get(1));
    }
}
