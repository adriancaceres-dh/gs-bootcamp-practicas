import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CarreraDeLaSelva {
    public static void main(String[] args) {

        int inscripcionesCircuitoChicoMenores = 1300;
        int inscripcionesCircuitoChicoMayores = 1500;
        int inscripcionesCircuitoMedioMenores = 2000;
        int inscripcionesCircuitoMedioMayores = 2300;
        int inscripcionesCircuitoAvanzado = 2800;

        Map<Integer, List<String>> participantesCC = new TreeMap<>();
        participantesCC.put(1, List.of("44002323", "Ignacio", "Maine", "20", "3492656936", "505939", "A+"));
        participantesCC.put(2, List.of("41030323", "Sergio", "Ricard", "23", "3492516968", "505938", "A+"));
        participantesCC.put(3, List.of("12345678", "José", "Gomez", "17", "3492516965", "505933", "A+"));

        Map<Integer, List<String>> participantesCM = new TreeMap<>();
        participantesCM.put(1, List.of("41000323", "Tincho", "Mainato", "20", "3492656936", "505939", "A+"));
        participantesCM.put(2, List.of("41000322", "Cosmo", "Fulanito", "23", "3492516968", "505938", "A+"));
        participantesCM.put(3, List.of("12345678", "Juan", "Gomez", "17", "3492516965", "505933", "A+"));

        Map<Integer, List<String>> participantesCA = new TreeMap<>();
        participantesCA.put(1, List.of("44305397", "Martín", "Maine", "20", "3492656936", "505939", "A+"));
        participantesCA.put(2, List.of("42128466", "Agustín", "Picard", "23", "3492516968", "505938", "A+"));
        participantesCA.put(3, List.of("12345678", "Pirulo", "Gomez", "17", "3492516965", "505933", "A+"));

        //Ejercicio A
        System.out.println("-----------------A------------------------");
        System.out.println("\nParticipantes del circuito chico");
        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            System.out.println(parti.getKey() + ": " + parti.getValue());
        }

        //Ejercicio B
        participantesCC.remove(2);

        System.out.println("-----------------B------------------------");
        System.out.println("\nParticipantes del circuito chico luego de desuscribirse un participante");
        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            System.out.println(parti.getKey() + ": " + parti.getValue());
        }

        //Ejercico C
        System.out.println("-----------------C------------------------");
        System.out.println("\nParticipantes del circuito chico - Montos a pagar");
        for (Map.Entry<Integer, List<String>> parti : participantesCC.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt < 18) {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoChicoMenores);
            } else {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoChicoMayores);
            }
        }

        System.out.println("\nParticipantes del circuito medio - Montos a pagar");
        for (Map.Entry<Integer, List<String>> parti : participantesCM.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt < 18) {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoMedioMenores)
                ;
            } else {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoMedioMayores);
            }
        }

        System.out.println("\nParticipantes del circuito avanzado - Montos a pagar");
        for (Map.Entry<Integer, List<String>> parti : participantesCA.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt > 18) {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoAvanzado);
            } else {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". NO puede anotarse al ser menor de edad");
            }
        }

        //Montos totales por circuito
        System.out.println("\n-----------------Montos por categoria------------------------");
        System.out.println("\nTotal recaudado en el circuito chico");
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
        System.out.println("\nEl total recaudado del circuito chico es $" + totalCircuitoChico);

        System.out.println("\nTotal recaudado en el circuito medio");
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
        System.out.println("\nEl total recaudado en el circuito medio es $" + totalCircuitoMedio);

        System.out.println("\nTotal recaudado en el circuito avanzado");
        int totalCircuitoAvanzado = 0;
        for (Map.Entry<Integer, List<String>> parti : participantesCA.entrySet()) {
            List<String> datos = parti.getValue();
            String edad = datos.get(3);
            int edadInt = Integer.parseInt(edad);
            // System.out.println(edad);
            if (edadInt > 18) {
                totalCircuitoAvanzado = totalCircuitoAvanzado + inscripcionesCircuitoAvanzado;
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". Deberá abonar $" + inscripcionesCircuitoAvanzado);
            } else {
                System.out.println(parti.getKey() + ": " + parti.getValue() + ". NO puede anotarse al ser menor de edad");
            }
        }
        System.out.println("\nEl total recaudado del circuito avanzado es $" + totalCircuitoAvanzado);

        System.out.println("\n-----------------Monto total------------------------");
        double recaudado = totalCircuitoAvanzado + totalCircuitoMedio + totalCircuitoChico;
        System.out.println("\nEl total recaudado de la carrera es $" + (double) Math.round(recaudado * 100d) / 100);
    }
}