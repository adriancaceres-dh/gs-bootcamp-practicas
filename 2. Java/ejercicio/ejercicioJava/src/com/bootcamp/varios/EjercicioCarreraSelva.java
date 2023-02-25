package com.bootcamp.varios;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EjercicioCarreraSelva {
    public static void main(String[] args) {

        System.out.println("-------- Carrera de la selva --------");
        System.out.println("¡No se permite inscripciones a menores de 18 años en circuito avanzado.!");
        System.out.println("¡Cada participante puede inscribirse únicamente a una categoría!");
        System.out.println("Las categorías  disponibles son: \n - Inscripción Circuito chico: 2 km por selva y arroyos. \n - Inscripción Circuito medio: 5 km por selva, arroyos y barro. \n - Inscripción Circuito Avanzado: 10 km por selva, arroyos, barro y escalada en piedra.");
        System.out.println("Los costos se visualizaran despues de haber cargado 5(cinco) participantes.");

        Map<String, List<String>> personas = new TreeMap<>();
        int generadorId = 0;

        Scanner scanner = new Scanner(System.in);

        int out = 0;
        while (out < 2 ) {
            out++;
            generadorId++;

            String idTomado = String.valueOf(generadorId);


            System.out.println("Ingrese sus datos para participar.");
            System.out.println("Dni:");
            String dni = scanner.next();
            System.out.println("Nombre:");
            String nombre = scanner.next();
            System.out.println("Apellido:");
            String apellido = scanner.next();
            System.out.println("Edad:");
            String edad = scanner.next();
            System.out.println("Por ultimo vamos a necesitar que elija el circuito al que quiera inscribirse \n Tener en cuenta que: \n Circuito chico = 0 \n Circuito medio = 1 \n Circuito avanzado = 2");
            System.out.println("Circuito a elegir ");
            String circuito = scanner.next();
            //System.out.println("Celular:");
            //String celular = scanner.next();

            personas.put(dni,List.of(idTomado, nombre, apellido, edad, circuito));
            System.out.println("Bienvenid@ " + personas.get(dni).get(1) + ", su ID personal es: " + personas.get(dni).get(0));


        };






        for (Map.Entry<String,List<String>> participante: personas.entrySet()) {

           String edadTomada = participante.getValue().get(3);
           String circuitoTomado = participante.getValue().get(4);


            int edadNumero = Integer.parseInt(edadTomada);
            int circuitoNumero = Integer.parseInt(circuitoTomado);

            if (circuitoNumero == 0) {
                if(edadNumero < 18) {
                    int montoAbonar = 1300;
                    System.out.println("El monto que debe abonar " + participante.getValue().get(1) + " es de $" + montoAbonar);
                } else {
                    int montoAbonar = 1500;
                    System.out.println("El monto que debe abonar " + participante.getValue().get(1) + " es de $" + montoAbonar);
                }
            } else if (circuitoNumero == 1) {
                if(edadNumero < 18) {
                    int montoAbonar = 2000;
                    System.out.println("El monto que debe abonar " + participante.getValue().get(1) + " es de $" + montoAbonar);
                } else {
                    int montoAbonar = 2300;
                    System.out.println("El monto que debe abonar " + participante.getValue().get(1) + " es de $" + montoAbonar);
                }
            } else if (circuitoNumero == 2) {
                if (edadNumero < 18) {
                    System.out.println("No se permiten menores de edad en circuito avanzado. Por favor elija otro circuito.");
                } else {
                    int montoAbonar = 2300;
                    System.out.println("El monto que debe abonar " + participante.getValue().get(1) + " es de $" + montoAbonar);
                }

            }  else {
                System.out.println("El numero elegido no corresponde con ninguna categoria disponible.");
            }
        }
    }


}
