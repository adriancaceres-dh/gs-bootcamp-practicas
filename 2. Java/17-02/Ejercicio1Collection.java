import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio1Collection {
    public static void main(String[] args) {

        //VALORES DE INSCRIPCIONES

        int inscripcionesCircuitoChicoMenores = 1300;
        int inscripcionesCircuitoChicoMayores = 1500;
        int inscripcionesCircuitoMedioMenores = 2000;
        int inscripcionesCircuitoMedioMayores = 2300;
        int inscripcionesCircuitoAvanzado = 2800;

        //HARDCODEAMOS LISTAS DE PARTICIPANTES

        Map<Integer, List<String>> participantesCC = new TreeMap<>();
        participantesCC.put(1, List.of("44002323", "Trinchera", "Maine", "20", "3492656936", "505939", "A+"));
        participantesCC.put(2, List.of("41030323", "Serjio", "Ricard", "23", "3492516968", "505938", "A+"));
        participantesCC.put(3, List.of("12345678", "Pirulo", "Gomez", "17", "3492516965", "505933", "A+"));


        Map<Integer, List<String>> participantesCM = new TreeMap<>();
        participantesCM.put(4, List.of("41000323", "Tincho", "Mainato", "20", "3492656936", "505939", "A+"));
        participantesCM.put(5, List.of("41000322", "Cosmo", "Fulanito", "23", "3492516968", "505938", "A+"));
        participantesCM.put(6, List.of("12345678", "Pirulo", "Gomez", "17", "3492516965", "505933", "A+"));

        Map<Integer, List<String>> participantesCA = new TreeMap<>();
        participantesCA.put(7, List.of("44305397", "Martín", "Maine", "20", "3492656936", "505939", "A+"));
        participantesCA.put(8, List.of("42128466", "Sergio", "Picard", "23", "3492516968", "505938", "A+"));
        participantesCA.put(9, List.of("12345678", "Pirulo", "Gomez", "17", "3492516965", "505933", "A+"));
        participantesCA.put(10, List.of("12345678", "Pirulo", "Gomez", "19", "3492516965", "505933", "A+"));
        participantesCA.put(11, List.of("12345678", "Pirulo", "Gomez", "21", "3492516965", "505933", "A+"));


        //Ejercicio A

        System.out.println("-----------------A------------------------");
        System.out.println("\nParticipantes del circuito chico");

        // HACEMOS UN FOR DE UNA DE LAS CATEGORIAS PARA MOSTRAR SUS PARTICIPANTES

        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            String nombre = datos.get(1) + " " + datos.get(2);
            String dni = datos.get(0);
            String cel =  datos.get(4);
            String eme = datos.get(5);
            String sang =  datos.get(6);

            System.out.println("Participante n°: "+parti.getKey() + " Nombre y apellido: " + nombre + ", DNI: " + dni + ", edad: " + edad + ", Celular: " + cel + ", N° de emergencia: "+ eme + ", grupo sanguineo: " + sang);
        }

        //Ejercicio B
        //REMOVEMOS A QUIEN TIENE LA KEY 2
        participantesCC.remove(2);

        System.out.println("-----------------B------------------------");
        System.out.println("\nParticipantes del circuito chico sin el key 2");


        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            String nombre = datos.get(1) + " " + datos.get(2);
            String dni = datos.get(0);
            String cel =  datos.get(4);
            String eme = datos.get(5);
            String sang =  datos.get(6);

            System.out.println("Participante n°: "+parti.getKey() + " Nombre y apellido: " + nombre + ", DNI: " + dni + ", edad: " + edad + ", Celular: " + cel + ", N° de emergencia: "+ eme + ", grupo sanguineo: " + sang);
        } // VOLVEMOS A MOSTRAR LA MISMA CATEGORIA PERO SIN EL PARTICIPANTE REMOVIDO

        //Ejercico C
        System.out.println("-----------------C------------------------");

        // PARTICIPANTES CIRCUITO CHICO
        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            String nombre = datos.get(1) + " " + datos.get(2);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt < 18) {
                System.out.println("El participante n°:" + parti.getKey() + " " + nombre + " deberá abonar $" + inscripcionesCircuitoChicoMenores);
            } else {
                System.out.println("El participante n°:" + parti.getKey() + " " + nombre + " deberá abonar $" + inscripcionesCircuitoChicoMayores);
            }
        }

        // PARTICIPANTES CIRCUITO MEDIO

        for (Map.Entry<Integer, List<String>> parti : participantesCM.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            String nombre = datos.get(1) + " " + datos.get(2);

            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt < 18) {
                System.out.println("El participante n°:" + parti.getKey() + " " + nombre + " deberá abonar $" + inscripcionesCircuitoMedioMenores);
            } else {
                System.out.println("El participante n°:" + parti.getKey() + " " + nombre + " deberá abonar $" + inscripcionesCircuitoMedioMayores);
            }
        }

        // PARTICIPANTES CIRCUITO AVANZADO


        for (Map.Entry<Integer, List<String>> parti : participantesCA.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            String nombre = datos.get(1) + " " + datos.get(2);


            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt > 18) {
                System.out.println("El participante n°:" + parti.getKey() + " " + nombre + " deberá abonar $" + inscripcionesCircuitoAvanzado);
            } else {
                System.out.println("El participante n°:" + parti.getKey() + " " + nombre + " no puede anotarse al ser menor de edad");
            }
        }

        //Montos totales por circuito
        System.out.println("\n-----------------Montos totales------------------------");

        int totalCircuitoChico = 0;
        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt < 18) {
                totalCircuitoChico = totalCircuitoChico + inscripcionesCircuitoChicoMenores;
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoChicoMenores);
            } else {
                totalCircuitoChico = totalCircuitoChico + inscripcionesCircuitoChicoMayores;
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoChicoMayores);
            }
        }
        System.out.println("\nEl total del Circuito Chico es $" + totalCircuitoChico);



        int totalCircuitoMedio = 0;
        for (Map.Entry<Integer, List<String>> parti : participantesCM.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt < 18) {
                totalCircuitoMedio = totalCircuitoMedio + inscripcionesCircuitoMedioMenores;
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoMedioMenores);
            } else {
                totalCircuitoMedio = totalCircuitoMedio + inscripcionesCircuitoMedioMayores;
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoMedioMayores);
            }
        }
        System.out.println("\nEl total del Circuito Medio es $" + totalCircuitoMedio);



        int totalCircuitoAvanzado = 0;
        for (Map.Entry<Integer, List<String>> parti : participantesCA.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt > 18) {
                totalCircuitoAvanzado = totalCircuitoAvanzado + inscripcionesCircuitoAvanzado;
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoAvanzado);
            }
        }
        System.out.println("\nEl total del Circuito Avanzado es $" + totalCircuitoAvanzado);

        //Montos totales por circuito
        double recaudado = totalCircuitoAvanzado + totalCircuitoMedio + totalCircuitoChico;
        System.out.println("\nEl total recaudado de la carrera es $" + (double) Math.round(recaudado * 100d) / 100);

    }
}