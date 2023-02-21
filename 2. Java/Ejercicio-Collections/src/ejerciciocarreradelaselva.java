import java.util.ArrayList;
import java.util.List;

class Persona{
    String nombre;
    String dni;
    int edad;
    int numeroParticipante;

    public void setEdad(String pamela) {
    }

    public void setNombre(String pamela) {

    }

    public void setDni(String s) {
    }

    public void setNumeroParticipante(int i) {

    }

    public String getNombre() {
    }

    public String getNumeroParticipante() {
    }

    public boolean getEdad() {
    }
}
public class Ejercicio1 {
    public static void main(String[] args) {
        // Mostrar por pantalla todos los inscriptos a una determinada categoría con sus correspondientes
        // datos y número de inscripción.
int cont = 0;

        Persona persona1 = new Persona();
        persona1.setNombre("Pamela");
        persona1.setDni("43545345");
        persona1.setEdad(21);
        persona1.setNumeroParticipante(cont++);

        Persona persona2 = new Persona();
        persona2.setNombre("Franco");
        persona2.setDni("37456879");
        persona2.setEdad(22);
        persona2.setNumeroParticipante(cont++);

        List<Persona> participante = new ArrayList<>();
        participante.add(persona1);
        participante.add(persona1);

        for (Persona p: participante) {
            if (p.getEdad()>=30) {
                System.out.println(p.getNombre() + " es un crack ");
            }
            System.out.println("El participante es " + p.getNombre() + " n° participante " + p.getNumeroParticipante());

        }


    }
}
