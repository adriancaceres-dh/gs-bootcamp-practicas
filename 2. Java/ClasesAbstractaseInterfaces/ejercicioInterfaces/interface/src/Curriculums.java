import java.util.Collections;
import java.util.List;

public class Curriculums {
  private   String nombre;
  private  String apellido;
  private int edad;

    private List<String> habilidades;
    public Curriculums(String nombre, String apellido,  int edad, String habilidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.habilidades = Collections.singletonList(habilidades);
        this.edad = edad;


    }

    @Override
    public String toString() {
        return "Curriculums{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", habilidades=" + habilidades +
                '}';
    }
}
