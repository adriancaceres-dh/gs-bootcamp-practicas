package documentos;

import java.util.ArrayList;
import java.util.List;

public class Curriculums implements Imprimible {
    private String nombre;
    private String apellido;
    private String dni;
    private String edad;

    private List<String> habilidades = new ArrayList<>();

    public Curriculums() {}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEdad() {
        return edad;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Curriculums(String nombre, String apellido, String dni, String edad, List<String> habilidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "documentos.Curriculums{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad='" + edad + '\'' +
                ", habilidades=" + habilidades +
                '}';
    }
}

