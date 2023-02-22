import java.util.*;

public class PracticaIntegradora {
    public static void main(String[] args) {

        Map<String,String> circuitos = new HashMap<>(); //
        circuitos.put("Circuito 1", "2km");
        circuitos.put("Circuito 2", "5km");
        circuitos.put("Circuito 3", "10km");

        int participantes1 = 0;
        int participantes2 = 0;
        int participantes3 = 0;
        int recaudacion = 0;
        int recaudacionCircuito1 = 0;
        int recaudacionCircuito2 = 0;
        int recaudacionCircuito3 = 0;

        Map<String, List<String>> datosParticipantes = new TreeMap<>();
        Map<String, List<String>> datosParticipantesCircuito1 = new TreeMap<>();
        Map<String, List<String>> datosParticipantesCircuito2 = new TreeMap<>();
        Map<String, List<String>> datosParticipantesCircuito3 = new TreeMap<>();

        int nuevasInscripciones = 1;

        for (int i = 1; i <= nuevasInscripciones; i++) {
            System.out.println("________________________________________________________________");
            System.out.println("Bienvenido!");
            System.out.println("________________________________________________________________");

            Scanner nuevo = new Scanner(System.in);
            System.out.println("¿Deseas inscribirte? \n 1) Si \n 2) No");

            int nuevoParticipante = nuevo.nextInt();

            if (nuevoParticipante != 1) {
                break;
            } else if (nuevoParticipante == 1) {
                nuevasInscripciones++;
                System.out.println("Ingrese sus datos para continuar");
                System.out.println(" ");
            }

            Scanner datosPersonales = new Scanner(System.in);
            System.out.println("Ingrese su edad: ");
            String edad = datosPersonales.next();

            System.out.println("Ingrese el circuito que desea paticipar: \n 1- Circuito chico \n 2- Circuito medio \n 3- Circuito avanzado");
            int circuito = datosPersonales.nextInt();

            if (circuito == 1) {
                participantes1++;
            } else if (circuito == 2) {
                participantes2++;
            } else if (circuito == 3) {
                participantes3++;
            }
            int costoInscripcion = 0;

            if (Integer.parseInt(edad) < 18) {

                switch (circuito) {
                    case 1:
                        costoInscripcion = 1300;
                        recaudacion = recaudacion + costoInscripcion;
                        recaudacionCircuito1 = recaudacionCircuito1 + costoInscripcion;
                        break;
                    case 2:
                        costoInscripcion = 1500;
                        recaudacion = recaudacion + costoInscripcion;
                        recaudacionCircuito2 = recaudacionCircuito2 + costoInscripcion;
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                        System.out.println("Ingrese el circuito que desea paticipar: \n 1- Circuito chico \n 2- Circuito medio \n 3- Circuito avanzado");
                        circuito = datosPersonales.nextInt();
                }


            } else if (Integer.parseInt(edad) >= 18) {

                switch (circuito) {
                    case 1:
                        costoInscripcion = 1500;
                        recaudacion = recaudacion + costoInscripcion;
                        recaudacionCircuito1 = recaudacionCircuito1 + costoInscripcion;
                        break;
                    case 2:
                        costoInscripcion = 2300;
                        recaudacion = recaudacion + costoInscripcion;
                        recaudacionCircuito2 = recaudacionCircuito2 + costoInscripcion;
                        break;
                    case 3:
                        costoInscripcion = 2800;
                        recaudacion = recaudacion + costoInscripcion;
                        recaudacionCircuito3 = recaudacionCircuito3 + costoInscripcion;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        System.out.println("Ingrese el circuito que desea paticipar: \n 1- Circuito chico \n 2- Circuito medio \n 3- Circuito avanzado");
                        circuito = datosPersonales.nextInt();
                }

            }
            System.out.println("Ingrese su DNI:");
            String dni = datosPersonales.next();

            System.out.println("Ingrese su Nombre:");
            String nombre = datosPersonales.next();

            System.out.println("Ingrese su Apellido:");
            String apellido = datosPersonales.next();

            System.out.println("Ingrse su numero de celular:");
            String celular = datosPersonales.next();

            System.out.println("Ingrese su numero de emergencia");
            String numEmergencia = datosPersonales.next();

            System.out.println("Ingrese su grupo sanguineo");
            String grupoSanguineo = datosPersonales.next();

            datosParticipantes.put("Participante "+ i, List.of(dni, nombre, apellido, edad, celular, numEmergencia, grupoSanguineo, "Circuito = " + circuito, "Costo de la inscripcion: $" + costoInscripcion));
            if(circuito == 1) {
                datosParticipantesCircuito1.put("Participante "+ i, List.of(dni, nombre, apellido, edad, celular, numEmergencia, grupoSanguineo, "Costo de la inscripcion: $" + costoInscripcion));
            } else if (circuito == 2) {
                datosParticipantesCircuito2.put("Participante "+ i, List.of(dni, nombre, apellido, edad, celular, numEmergencia, grupoSanguineo, "Costo de la inscripcion: $" + costoInscripcion));
            } else if (circuito == 3) {
                datosParticipantesCircuito3.put("Participante "+ i, List.of(dni, nombre, apellido, edad, celular, numEmergencia, grupoSanguineo, "Costo de la inscripcion: $" + costoInscripcion));
            }
        }

        System.out.println("________________________________________________________________");

        System.out.println("Datos del total de los participantes: " + datosParticipantes);

        System.out.println("Datos participantes circuito chico: " + datosParticipantesCircuito1);

        System.out.println("Datos participantes circuito mediano: " + datosParticipantesCircuito2);

        System.out.println("Datos participantes circuito avanzado: " + datosParticipantesCircuito3);

        System.out.println("La cantidad de participante en total es: " + datosParticipantes.size() + "\n Participantes circuito 1: " + datosParticipantesCircuito1.size()  + "\n Participantes circuito 2: " + datosParticipantesCircuito2.size() + "\n Participantes circuito 3: " + datosParticipantesCircuito3.size());

        System.out.println("La recaudacion total del circuito n° 1: $" + recaudacionCircuito1);

        System.out.println("La recaudacion total del circuito n° 2: $" + recaudacionCircuito2);

        System.out.println("La recaudacion total del circuito n° 3:  $" + recaudacionCircuito3);

        System.out.println("La recaudacion total fue de: $" +recaudacion);



        System.out.println("________________________________________________________________");

        Scanner eliminar = new Scanner(System.in);

        System.out.println("¿Desea eliminar a alguien de la lista? \n 1) SI \n 2) NO");

        int eliminando = eliminar.nextInt();

        if (eliminando == 1) {
            Scanner participanteAeliminar = new Scanner(System.in);
            System.out.println("Indique el numero del participante que desea eliminar");
            String participanteEliminado = "Participante " + participanteAeliminar.next();
            datosParticipantes.remove(participanteEliminado);
            System.out.println(datosParticipantes);
        } else {
            System.out.println("Gracias!");
        }

    }

}
