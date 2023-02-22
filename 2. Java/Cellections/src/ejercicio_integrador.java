import java.util.*;

class Persona {
    String nombre;
    String DNI;
    int edad;
    int numeroParticipante;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

}
public class carrera_de_la_selva {

    public static void main(String[] args) {

        Persona perona1 = new Persona();
        perona1.setNombre("Nicolas");
        perona1.setDNI("35637064");
        perona1.setEdad(32);


        Persona perona2 = new Persona();
        perona2.setNombre("jorge");
        perona2.setDNI("35637065");
        perona2.setEdad(30);

        List<Persona> participante = new ArrayList<>();

        participante.add(perona1);
    }
}
