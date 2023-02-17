import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Persona {
    String nombre;
    String dni;
    int edad;
    int numeroParticipante;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    int categoria;   // hardcodeo porque no pedimos datos por teclado
    // 1 - chico   2 -  Medio  3 - Avanzado

    public int getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", numeroParticipante=" + numeroParticipante +
                ", categoria=" + categoria +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        // Incribir a corredores en la carrera y mostrar informes
        int cont = 0;

        // Datos hardcodeados
        Persona persona1 = new Persona();
        persona1.setNombre("Pamela");
        persona1.setDni("43545345");
        persona1.setEdad(21);
        persona1.setNumeroParticipante(cont++);
        persona1.setCategoria(1);

        Persona persona2 = new Persona();
        persona2.setNombre("Franco");
        persona2.setDni("43234535");
        persona2.setEdad(22);
        persona2.setNumeroParticipante(cont++);
        persona2.setCategoria(2);

        Persona persona3 = new Persona();
        persona3.setNombre("Nico");
        persona3.setDni("43234535");
        persona3.setEdad(32);
        persona3.setNumeroParticipante(cont++);
        persona3.setCategoria(3);

        Persona persona4 = new Persona();
        persona4.setNombre("Aye");
        persona4.setDni("4323344");
        persona4.setEdad(17);
        persona4.setNumeroParticipante(cont++);
        persona4.setCategoria(3);

        List<Persona> participantes = new ArrayList<>();
        participantes.add(persona1);
        participantes.add(persona2);
        participantes.add(persona3);
        participantes.add(persona4);
        // hasta aca, hardcodeo

        Map<String, List<Persona>> carrera = new TreeMap<>();
        List<Persona> p1 = new ArrayList<>();
        carrera.put("Chico", p1);
        List<Persona> p2 = new ArrayList<>();
        carrera.put("Mediano", p2);
        List<Persona> p3 = new ArrayList<>();
        carrera.put("Avanzado", p3);
        List<Persona> p4 = new ArrayList<>();
        carrera.put("FueraInscripcion", p4);

        // descrinscribir
        // hardcodeo , luego elegir a quien desinscribir
        participantes.remove(0);


        for (Persona persona : participantes) {

            System.out.println("El participante es " + persona.getNombre()
                    + " nro. participante " + persona.getNumeroParticipante());

            if (persona.getCategoria() == 3 && persona.getEdad() < 18) {
                System.out.println("No se puede inscribir al avanzado");
                // interactuar
                carrera.get("FueraInscripcion").add(persona);

            } else {
                if (persona.getCategoria() == 1) {
                    carrera.get("Chico").add(persona);
                }
                if (persona.getCategoria() == 2) {
                    carrera.get("Mediano").add(persona);
                }
                if (persona.getCategoria() == 3) {
                    carrera.get("Avanzado").add(persona);
                }
            }
        }


        for (Map.Entry<String, List<Persona>> circuito : carrera.entrySet()) {
            // muestro circuito y participantes
            System.out.println(circuito.getKey() + " " + circuito.getValue());
            montoPorCircuito(circuito);
        }



    }

    private static void montoPorCircuito(Map.Entry<String, List<Persona>> circuito) {

        double[] importeCirtuito = {0.0, 0.0, 0.0};
        // 0 - chico 1- medio 2- avanzado

        if (circuito.getKey().equals("Chico")) {
            for (Persona persona : circuito.getValue()) {
                if (persona.getEdad() > 18) {
                    System.out.println(persona.getNombre() + " Paga 1500");
                    importeCirtuito[0] += 1500.0;
                } else {
                    System.out.println(persona.getNombre() + " Paga 1300");
                    importeCirtuito[0] += 1300.0;
                }
            }
        } else if (circuito.getKey().equals("Mediano")) {
            for (Persona persona : circuito.getValue()) {
                if (persona.getEdad() > 18) {
                    System.out.println(persona.getNombre() + " Paga 2300");
                    importeCirtuito[1] += 2300.0;
                } else {
                    System.out.println(persona.getNombre() + " Paga 2000");
                    importeCirtuito[1] += 2000.0;
                }
            }
        } else if (circuito.getKey().equals("Avanzado")) {
            for (Persona persona : circuito.getValue()) {
                System.out.println(persona.getNombre() + " Paga 2800");
                importeCirtuito[2] += 2800.0;
            }
        } else if (circuito.getKey().equals("FueraInscripcion")) {
            for (Persona persona : circuito.getValue()) {
                System.out.println(persona.getNombre() + " fuera de inscripcion ");
            }

        }

        System.out.println("Total circuito chico " + importeCirtuito[0]);
        System.out.println("Total circuito medio " + importeCirtuito[1]);
        System.out.println("Total circuito avanzado " + importeCirtuito[2]);

    }
}