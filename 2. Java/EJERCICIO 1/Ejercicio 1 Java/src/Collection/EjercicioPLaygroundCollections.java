package Collection;

import java.util.List;
import java.util.Map;
import java.util.*;
/*
class Persona {
         String nombre;
         String apellido;
         String dni;
         int edad;
         int celular;
         int numeroParticipante;
         int numEmergencia;
        String grupoSanguineo;
        int categoria;   // hardcodeo porque no pedimos datos por teclado
// 1 - chico   2 -  Medio  3 - Avanzado

     public int getCelular() {
         return celular;
     }

     public void setCelular(int celular) {
         this.celular = celular;
     }

     public int getNumEmergencia() {
         return numEmergencia;
     }

     public void setNumEmergencia(int numEmergencia) {
         this.numEmergencia = numEmergencia;
     }

     public String getGrupoSanguineo() {
         return grupoSanguineo;
     }

     public void setGrupoSanguineo(String grupoSanguineo) {
         this.grupoSanguineo = grupoSanguineo;
     }

     public int getCategoria() {
        return categoria;
        }

public void setCategoria(int categoria) {
        this.categoria = categoria;
        }

     public String getApellido() {
         return apellido;
     }

     public void setApellido(String apellido) {
         this.apellido = apellido;
     }

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
        ", apellido='" + apellido + '\'' +
        ", dni='" + dni + '\'' +
        ", edad=" + edad +
        ", celular=" + celular +
        ", grupoSanguineo='" + grupoSanguineo + '\'' +
        ", numeroParticipante=" + numeroParticipante +
        ", numeroParticipante=" + numeroParticipante +
        ", categoria=" + categoria +
        '}';
        }
*/

public class EjercicioPLaygroundCollections {
/*
    public static void main(String[] args) {
/*
        //Resulto en clase Version 1
         // Incribir a corredores en la carrera y mostrar informes
        int cont = 0;

        // Datos hardcodeados
        Persona persona1 = new Persona(); // generar objeto definido en la estructura personas
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
       // Persona[] participantes;
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
*/

    /*
        // Resulto profesor Version 2
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
        }

        double[] totalesPorCircuito =  montoPorCircuito(carrera);
        System.out.println( "Total circuito chico " + totalesPorCircuito[0] );
        System.out.println( "Total circuito medio " + totalesPorCircuito[1] );
        System.out.println( "Total circuito avanzado " + totalesPorCircuito[2] );

        double total = totalesPorCircuito[0] + totalesPorCircuito[1] + totalesPorCircuito[2];
        System.out.println("Total general" + " "+ total);
    }

     private static double[] montoPorCircuito(Map<String, List<Persona>> carrera) {

         double[] importeCirtuito = {0.0, 0.0, 0.0};

         for (Map.Entry<String, List<Persona>> circuito : carrera.entrySet()) {
             for (Persona persona : circuito.getValue()) {
                 if (circuito.getKey().equals("Chico")) {
                     if (persona.getEdad() > 18) {
                         System.out.println(persona.getNombre() + " Paga 1500");
                         importeCirtuito[0] += 1500.0;
                     } else {
                         System.out.println(persona.getNombre() + " Paga 1300");
                         importeCirtuito[0] += 1300.0;
                     }
                 }
                 if (circuito.getKey().equals("Mediano")) {
                     if (persona.getEdad() > 18) {
                         System.out.println(persona.getNombre() + " Paga 2300");
                         importeCirtuito[1] += 2300.0;
                     } else {
                         System.out.println(persona.getNombre() + " Paga 2000");
                         importeCirtuito[1] += 2000.0;
                     }
                 }
                 if (circuito.getKey().equals("Avanzado")) {
                     System.out.println(persona.getNombre() + " Paga 2800");
                     importeCirtuito[2] += 2800.0;
                 }
                 if (circuito.getKey().equals("FueraInscripcion")) {
                     System.out.println(persona.getNombre() + " fuera de inscripcion ");
                 }

             }


         }
         return importeCirtuito;
       */

/*

        // MI VERSION:

        Map<Integer, Map<String, String>> inscriptos = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int ultInscripto = 0;


        while (true) {
            System.out.println("Ingrese la categoría a la que desea inscribirse:");
            System.out.println("1. Circuito chico");
            System.out.println("2. Circuito medio");
            System.out.println("3. Circuito avanzado");
            int categoria = sc.nextInt();
            if (categoria < 1 || categoria > 3) {
                System.out.println("Categoría inválida");
                continue;
            }

            System.out.println("Ingrese su DNI:");
            String dni = sc.next();
            System.out.println("Ingrese su nombre:");
            String nombre = sc.next();
            System.out.println("Ingrese su apellido:");
            String apellido = sc.next();
            System.out.println("Ingrese su edad:");
            int edad = sc.nextInt();
            System.out.println("Ingrese su número de celular:");
            String celular = sc.next();
            System.out.println("Ingrese su número de emergencia:");
            String numEmergencia = sc.next();
            System.out.println("Ingrese su grupo sanguíneo:");
            String grupoSanguineo = sc.next();

            int inscriptosCircuitoChico=0;
            int inscriptosCircuitoMedio=0;
            int inscriptosCircuitoAvanzado=0;

            if (categoria == 1) {
                if (edad <=18) {
                    inscriptosCircuitoChico++;
                }
            } else if (categoria == 2) {
                if (edad < 18 || edad > 18) {
                    inscriptosCircuitoMedio++;
                }
            } else if ((categoria == 3)) {
                if ( edad > 18) {
                    inscriptosCircuitoAvanzado++;
                } else {
                    System.out.println("No puede inscribirse");
                }
            }

            int monto;
            if (categoria == 1) {
                if (edad < 18) {

                    monto = 1300;
                } else {
                    monto = 1500;
                }
            } else if (categoria == 2) {
                if (edad < 18) {
                    monto = 2000;
                } else {
                    monto = 2300;
                }
            } else {
                if (edad < 18) {
                    System.out.println("No se permiten inscripciones a menores de 18 años");
                    continue;
                }
                monto = 2800;
            }

            ultInscripto++;
           inscriptosCircuitoChico++;
           inscriptosCircuitoMedio++;
           inscriptosCircuitoAvanzado++;

            Map<String, String> datos = new HashMap<>();
            datos.put("DNI", dni);
            datos.put("Nombre", nombre);
            datos.put("Apellido", apellido);
            datos.put("Edad", String.valueOf(edad));
            datos.put("Celular", celular);
            datos.put("Número de emergencia", numEmergencia);
            datos.put("Grupo sanguíneo", grupoSanguineo);
            datos.put("Categoría", String.valueOf(categoria));
            datos.put("Número de inscripción", String.valueOf(ultInscripto));
            datos.put("Monto", String.valueOf(monto));
            inscriptos.put(ultInscripto, datos);


            System.out.println("Inscripción exitosa");
            System.out.println("Su número de inscripción es: " + ultInscripto);
            System.out.println("El monto a abonar es: $" + monto);
            System.out.print("Inscriptos: " + inscriptos);
            //System.out.println("Inscriptos circuito chico : " +  inscriptosCircuitoChico);
            //System.out.println("Inscriptos circuito medio : " +  inscriptosCircuitoMedio);
            //System.out.println("Inscriptos circuito avanzado : " +  inscriptosCircuitoAvanzado);

            System.out.println("¿Desea inscribir a otro participante? (s/n)");
            String opcion = sc.next();
            if (opcion.equals("n")) {
                break;
            }
        }

    }
  */
}
