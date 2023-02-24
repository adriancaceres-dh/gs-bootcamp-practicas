package ClasesAbstractaseInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculums implements Impresora{
    private String nombre;

    private String apellido;

    private List<String> habilidades = new ArrayList<>();

    public <T> Curriculums(String nombre, String apellido, List<T> asList) {
    }

    public Curriculums() {

    }

    @Override
    public String toString() {
        return "Curriculums{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", habilidades=" + habilidades +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Se ha impreso");
    }
}
