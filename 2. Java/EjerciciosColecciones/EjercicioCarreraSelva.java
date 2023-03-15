import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCarreraSelva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> circuitoChico = new ArrayList<>();
        ArrayList<String> circuitoMedio = new ArrayList<>();
        ArrayList<String> circuitoAvanzado = new ArrayList<>();
        int numInscripcion = 1;

        while (true) {
            System.out.println("Bienvenido a la Carrera de la Selva");
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Inscribir participante");
            System.out.println("2 - Desinscribir participante");
            System.out.println("3 - Mostrar inscriptos en circuito chico");
            System.out.println("4 - Mostrar inscriptos en circuito medio");
            System.out.println("5 - Mostrar inscriptos en circuito avanzado");
            System.out.println("6 - Calcular monto total recaudado por categoría");
            System.out.println("7 - Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la categoría (1 - Circuito chico, 2 - Circuito medio, 3 - Circuito avanzado):");
                    int categoria = scanner.nextInt();

                    System.out.println("Ingrese su dni:");
                    int dni = scanner.nextInt();

                    System.out.println("Ingrese su nombre:");
                    String nombre = scanner.next();

                    System.out.println("Ingrese su apellido:");
                    String apellido = scanner.next();

                    System.out.println("Ingrese su edad:");
                    int edad = scanner.nextInt();

                    System.out.println("Ingrese su celular:");
                    String celular = scanner.next();

                    System.out.println("Ingrese el número de emergencia:");
                    String numEmergencia = scanner.next();

                    System.out.println("Ingrese su grupo sanguíneo:");
                    String grupoSanguineo = scanner.next();

                    int monto;
                    if (categoria == 1) {
                        if (edad < 18) {
                            monto = 1300;
                        } else {
                            monto = 1500;
                        }
                        circuitoChico.add(numInscripcion + "," + dni + "," + nombre + "," + apellido + "," + edad + "," + celular + "," + numEmergencia + "," + grupoSanguineo + "," + monto);
                    } else if (categoria == 2) {
                        if (edad < 18) {
                            monto = 2000;
                        } else {
                            monto = 2300;
                        }
                        circuitoMedio.add(numInscripcion + "," + dni + "," + nombre + "," + apellido + "," + edad + "," + celular + "," + numEmergencia + "," + grupoSanguineo + "," + monto);
                    } else if (categoria == 3) {
                        if (edad < 18) {
                            System.out.println("Lo siento, no se permiten inscripciones a menores de 18 años en el Circuito Avanzado.");
                            break;
                        } else {
                            monto = 2800;
                            circuitoAvanzado.add(numInscripcion + "," + dni + "," + nombre + "," + apellido + "," + edad + "," + celular + "," + numEmergencia + "," + grupoSanguineo + "," + monto);
                            break;
                        }
                    }
                    numInscripcion++;

            }
        }
    }

}
