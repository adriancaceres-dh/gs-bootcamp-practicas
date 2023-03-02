package clasesAbstractasInterfases;
import java.util.ArrayList;
import java.util.List;

public class Curriculums implements Imprimible{
    private String nombre;
    private String apellido;
    private List<String> habilidades = new ArrayList<>();
    @Override
    public void imprimir() {
        System.out.println("Curriculum impreso");
    }
}
