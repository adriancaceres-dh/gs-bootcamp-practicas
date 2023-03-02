import java.util.ArrayList;
import java.util.List;

public class Persona {

    String nombre;
    String edad;
    String dni;
    Double peso;
    Double altura;

    public Persona() {};

    public Persona(String nombre, String edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, String edad, String dni, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        int IMC;
        double valor;
        valor = peso/Math.pow(altura, 2);

        if (valor > 25) {
            IMC = 1;
        } else if (valor >= 20) {
            IMC = 0;
        } else {
            IMC = -1;
        }

        return IMC;
    }

    public Boolean esMayorDeEdad() {
        boolean verificacion;

        if (Integer.parseInt(edad) >= 18) {
            verificacion = true;
        } else {
            verificacion = false;
        }
        return verificacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", dni='" + dni + '\'' +
                ", peso='" + peso + '\'' +
                ", altura='" + altura + '\'' +
                '}';
    }
//    List<Persona> personas = new ArrayList<>();
//
//    public void agregarPersona(Persona persona) {
//        personas.add(persona);
//    }
//    public String listarPersonas() {
//        String listaPersonas = "";
//        for (Persona persona: personas) {
//            listaPersonas = listaPersonas + persona.toString() + "\n";
//        }
//return listaPersonas;
//    }
}