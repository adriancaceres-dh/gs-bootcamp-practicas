package clasesabstractaseinterfaces;
import java.util.ArrayList;
import java.util.List;

public class Curriculums extends Documento implements Imprimible{

    private String nombre;
    private String apellido;

    private List<String> habilidades =  new ArrayList<>();

    public Curriculums(){
        super();
    }

    public Curriculums(Integer cantidadDePaginas, String nombreAutor) {
        super(cantidadDePaginas, nombreAutor);
    }


    @Override
    public void imprimir() {
        System.out.println("Curriculum impreso");
    }
}
