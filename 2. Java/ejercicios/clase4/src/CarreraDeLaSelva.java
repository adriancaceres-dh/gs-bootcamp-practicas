import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarreraDeLaSelva {
    public static void main(String[] args) {

        // dni, nombre, apellido, edad, celular, número de emergencia y grupo sanguíneo

        Scanner scanner = new Scanner(System.in);
        Map<Integer, ArrayList> participantesChico = new HashMap<>();
        Map<Integer, ArrayList> participantesMedio = new HashMap<>();
        Map<Integer, ArrayList> participantesAvanzado = new HashMap<>();

        Map<Integer, Integer> recaudacion = new HashMap<>();
        recaudacion.put(1, 0);
        recaudacion.put(2, 0);
        recaudacion.put(3, 0);


        int ingreso = 1;
        int id = 1;
        String nombre;
        String apellido;
        int edad;
        String celular;
        String num_emergencia;
        String grupo_sanguineo;
        int circuito;
        int costo;


        while (ingreso != 0) {

            ArrayList<String> persona = new ArrayList<>();

            System.out.println("Ingrese su nombre");
            nombre = scanner.next();

            System.out.println("Ingrese su apellido");
            apellido = scanner.next();

            System.out.println("Ingrese su edad");
            edad = scanner.nextInt();

            System.out.println("Ingrese su celular");
            celular = scanner.next();

            System.out.println("Ingrese un numero de emergencia");
            num_emergencia = scanner.next();

            System.out.println("Ingrese su grupo sanguineo");
            grupo_sanguineo = scanner.next();

            System.out.println("En cual circuito desea inscribirse?");
            System.out.println("Circuito chico: 1");
            System.out.println("Circuito medio: 2");
            System.out.println("Circuito avanzado: 3");
            circuito = scanner.nextInt();


            persona.add(nombre);
            persona.add(apellido);
            persona.add(edad + " años");
            persona.add("Cel: " + celular);
            persona.add("Numero de emergencia: " + num_emergencia);
            persona.add("Grupo sanguineo: " + grupo_sanguineo);

            switch (circuito) {
                case 1:
                    participantesChico.put(id, persona);
                    if (edad < 18) {
                        costo = 1300;
                        recaudacion.put(1, recaudacion.get(1) + costo);
                    } else {
                        costo = 1500;
                        recaudacion.put(1, recaudacion.get(1) + costo);
                    }
                    break;

                case 2:
                    participantesMedio.put(id, persona);
                    if (edad < 18) {
                        costo = 2000;
                        recaudacion.put(2, recaudacion.get(2) + costo);
                    } else {
                        costo = 2300;
                        recaudacion.put(2, recaudacion.get(2) + costo);
                    }
                    break;

                case 3:
                    if (edad < 18) {

                        System.out.println("No te puedes inscribir en esta categoria");
                    } else {
                        participantesAvanzado.put(id, persona);
                        costo = 2800;
                        recaudacion.put(3, recaudacion.get(3) + costo);
                    }
                    break;
            }

            System.out.println(persona);

            id++;

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Ingrese 1 (uno) para continuar agregando participantes. 0 (cero) para terminar");
            System.out.println("-------------------------------------------------------------------------------");
            ingreso = scanner.nextInt();
        }
        ;


        System.out.println("Los participantes del circuito chico son: ");
        System.out.println(participantesChico);
        System.out.println("Los participantes del circuito medio son: ");
        System.out.println(participantesMedio);
        System.out.println("Los participantes del circuito avanzado son: ");
        System.out.println(participantesAvanzado);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("La recaudacion total fue: ");
        System.out.println(recaudacion);
        System.out.println("-------------------------------------------------------------------------------------");


    }
}