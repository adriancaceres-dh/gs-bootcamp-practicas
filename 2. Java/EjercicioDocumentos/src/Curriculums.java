import java.util.ArrayList;
import java.util.List;

public class Curriculums implements Imprimible{
    private String nombre;
    private String apellido;
    private List<String> habilidades = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void imrpimir() {
        System.out.println("Curriculum impreso");
    }
}
