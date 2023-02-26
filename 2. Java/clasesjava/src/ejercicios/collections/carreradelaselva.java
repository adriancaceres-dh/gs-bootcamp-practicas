//EJERCICIO CLASE N° 3

package ejercicios.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
//clase persona con los atributos necesarios
class Persona {
    int dni;
    String nombre;
    String apellido;
    int edad;
    long celular;
    long numeroEmergencia;
    String grupoSanguineo;
    int numeroParticipante;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(long numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    @Override //mostramos en un objeto los datos de cada persona
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", celular=" + celular +
                ", numeroEmergencia=" + numeroEmergencia +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", numeroParticipante=" + numeroParticipante +
                '}';
    }


}

public class carreradelaselva {
    public static void main(String[] args) {

        //Inscripcion a una carrera mostrando los datos de la inscripcion

        List<Persona> chico = new ArrayList<>();
        List<Persona> mediano = new ArrayList<>();
        List<Persona> avanzado = new ArrayList<>();
        List<Persona> noInscriptos = new ArrayList<>();

        System.out.println("Bienvenido, a que carrera queres inscribirte?");
        System.out.println("-----------------------------------------------");

        int continuar = 1;
        int contador = 1;

        //si se selecciona 1 continua el proceso si coloca 0 se corta

        while (continuar != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("A que circuito queres inscribite?");
            System.out.println("Selecciona: 1-Para Circuito Chico, 2-Circuito Mediano, 3-Circuito Avanzado");

            int circuito = sc.nextInt();

            System.out.println("Ingresa tu nombre");
            String nombre = sc.next();

            System.out.println("Ingresa tu apellido");
            String apellido = sc.next();

            System.out.println("Ingresa tu DNI");
            int dni = sc.nextInt();

            System.out.println("Ingresa tu edad");
            int edad = sc.nextInt();

            System.out.println("Ingresa tu celular");
            long celular = sc.nextLong();

            System.out.println("Ingresa la número de emergencia: ");
            long numeroEmergencia = sc.nextLong();


            System.out.println("Ingresa tu grupo sanguineo");
            String grupoSanguineo = sc.next();

            int numeroParticipante = contador;

            //creamos una persona con los datos que se ingresaron
            Persona persona = new Persona();

            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDni(dni);
            persona.setEdad(edad);
            persona.setCelular(celular);
            persona.setNumeroEmergencia(numeroEmergencia);
            persona.setGrupoSanguineo(grupoSanguineo);
            persona.setNumeroParticipante(numeroParticipante);


            //almacenamos de acuerdo al circuito que eligieron
            switch (circuito) {
                case 1:
                    chico.add(persona);
                    break;

                case 2:
                    mediano.add(persona);
                    break;

                case 3:
                    if (persona.edad >= 18) {
                        avanzado.add(persona);
                    } else {
                        noInscriptos.add(persona);
                    }
                    break;

                default:
                    System.out.println("Ocurrio un error. No puso agregar el participante.");
            }

            //aumentamos el contador para incrementar en 1 el num de participante
            contador++;

            //si ponemos 1 vuelve a pedir datos de personas, si ponemos 0 sale del while y continua.
            System.out.println("-------------------------------------------------------------");
            System.out.println("Queres agregar otro participante? 0-No 1-Si");
            continuar = sc.nextInt();
        }

        //mostrar en consola los participantes de cada categoria
        System.out.println("----------------------------------------------------");
        System.out.println("Participantes Circuito Chico: ");
        for (Persona persona : chico) {
            if (persona.getEdad() >= 18) {
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $1500.");
            } else {
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $1300.");
            }
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Participantes Circuito Mediano: ");
        for (Persona persona : mediano) {
            if (persona.getEdad() >= 18) {
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $2300.");
            } else {
                System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $2000.");
            }
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Participantes Circuito Avanzado: ");
        for (Persona persona : avanzado) {
            System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni() + ". Debe abonar: $2800.");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Participantes No inscriptos: ");
        for (Persona persona : noInscriptos) {
            System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
        }

        System.out.println("----------------------------------------------------");

        //eliminar inscripcion de un participante
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("¿Queres eliminar la inscripción de un participante?");
        System.out.println("Ingresar 1-SI 2-NO");
        int desinscribir = sc.nextInt();

        while (desinscribir == 1) {
            System.out.println("----------------------------------------------------");

            System.out.println("Ingresa la categoria del participante: ");
            System.out.println("Presione: 1-Para Circuito Chico, 2-Circuito Mediano, 3-Circuito Avanzado");
            int categoria = sc.nextInt();

            System.out.println("Ingresa el DNI del participante a eliminar: ");
            int dniEliminar = sc.nextInt();

            switch (categoria) {
                case 1:
                    for (int i = 0; i < chico.size(); i++) {
                        if (chico.get(i).getDni() == dniEliminar) {
                            System.out.println("Se ha eliminado el participante con DNI: " + chico.get(i).getDni() + ". Nombre y Apellido: " + chico.get(i).getNombre() + " " + chico.get(i).getApellido());
                            chico.remove(chico.get(i));
                        } else {
                            System.out.println("Participante no encontrado");
                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < mediano.size(); i++) {
                        if (mediano.get(i).getDni() == dniEliminar) {
                            System.out.println("Se ha eliminado el participante con DNI: " + mediano.get(i).getDni() + ". Nombre y Apellido: " + mediano.get(i).getNombre() + " " + mediano.get(i).getApellido());
                            mediano.remove(mediano.get(i));
                        } else {
                            System.out.println("Participante no encontrado");
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < avanzado.size(); i++) {
                        if (avanzado.get(i).getDni() == dniEliminar) {
                            System.out.println("Se ha eliminado el participante con DNI: " + avanzado.get(i).getDni() + ". Nombre y Apellido: " + avanzado.get(i).getNombre() + " " + avanzado.get(i).getApellido());
                            avanzado.remove(avanzado.get(i));
                        } else {
                            System.out.println("Participante no encontrado");
                        }
                    }
                    break;

            }

            System.out.println("----------------------------------------------------");
            System.out.println("Queres eliminar otro participante? ");
            System.out.println("Ingresar: 1(si) 2(no)");
            int seguir = sc.nextInt();

            //mostrar por consola los participantes de las categorias y cambiar el valor de desinscribir si elige no eliminar mas
            if(seguir == 2){
                System.out.println("----------------------------------------------------");
                System.out.println("Participantes Circuito Chico: ");
                for (Persona persona : chico) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                System.out.println("Participantes Circuito Mediano: ");
                for (Persona persona : mediano) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                System.out.println("Participantes Circuito Avanzado: ");
                for (Persona persona : avanzado) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                System.out.println("Participantes No inscriptos: ");
                for (Persona persona : noInscriptos) {
                    System.out.println("Participante N°" + persona.getNumeroParticipante() + ": " + persona.getNombre() + " " + persona.getApellido() + ", DNI: " + persona.getDni());
                }
                System.out.println("----------------------------------------------------");

                desinscribir = 0;
            }

            //calculamos todo lo reacudado segun categoria y carrera

            Map<String, List<Persona>> carrera = new TreeMap<>();
            carrera.put("Circuito Chico", chico);
            carrera.put("Circuito Mediano", mediano);
            carrera.put("Circuito Avanzado", avanzado);

            double[] montoPorCircuito = {0.0,0.0,0.0};

            for (Map.Entry<String,List<Persona>> circuito : carrera.entrySet()){
                for (Persona persona : circuito.getValue()) {
                    if(circuito.getKey().equals("Circuito Chico")){
                        if(persona.getEdad() < 18){
                            montoPorCircuito[0] += 1300;
                        }else{
                            montoPorCircuito[0] += 1500;
                        }
                    }
                    if(circuito.getKey().equals("Circuito Mediano")){
                        if(persona.getEdad() < 18){
                            montoPorCircuito[1] += 2000;
                        }else{
                            montoPorCircuito[1] += 2300;
                        }
                    }
                    if(circuito.getKey().equals("Circuito Avanzado")){
                        montoPorCircuito[2] += 2800;
                    }
                }

            }

            System.out.println("--------------------------------------------------------");
            System.out.println("El monto recaudado por cada categoria es de:");
            System.out.println("CIRCUITO CHICO: $" + montoPorCircuito[0]);
            System.out.println("CIRCUITO MEDIANO: $" + montoPorCircuito[1]);
            System.out.println("CIRCUITO AVANZADO: $" + montoPorCircuito[2]);
            System.out.println("--------------------------------------------------------");
            System.out.println("La suma recaudada por la CARRERA es de: $" + (montoPorCircuito[0]+montoPorCircuito[1]+montoPorCircuito[2]));
            System.out.println("--------------------------------------------------------");

        }

    }
}
