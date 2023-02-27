import java.util.ArrayList;
import java.util.List;

public class Curriculum implements Imprimible{
    private String nombre;
    private String apellido;
    private int edad;
    private List<String> habilidades = new ArrayList<>();

    public Curriculum(String nombre, String apellido, int edad, List<String> habilidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.habilidades = habilidades;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculum {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", habilidades=" + habilidades +
                '}';
    }

    @Override
    public void imprimirDocumento() {
        System.out.println(toString());
    }
}
