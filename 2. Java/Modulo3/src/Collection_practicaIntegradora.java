import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection_practicaIntegradora {
    {
    //mostrar por consola información de corredor + su número de participante para una categoria//
    int[] datosCorredor = new int;


        //Datos Corredor//
        int dni;
        String nombre;
        String apellido;
        int edad;
        long celular;
        long contactoEmergencia;
        String grupoSanguineo;
        int numeroParticipande;


    ;

    List<datosCorredor> listaPersonas = new ArrayList<datosCorredor();

    int numeroCorredor = 1;
    int nuevoCorredor = numeroCorredor++;
            if(numeroCorredor !==nuevoCorredor)

    {
        nuevoCorredor = numeroCorredor++;

        List<competidoresCC> listaPersonasCC = new ArrayList<competidoresCC>();
        listaPersonasCC.add(new competidoresCC(numCorredor,“Cristiano”,“Ronaldo”));
    }
        //eliminar a un participante de una categoria


        // determinar el monto a abonar por el corredor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresé la edad del participante");
        int edad; =scanner.nextDouble();
        System.out.println("Ingresé la en que categoría quiere participar:  \n 1- Circuito chico  \n 2- Circuito medio  \n circuito avanzado (SOLO PARA MAYORES DE 18 AÑOS)");
        int circuito; =scanner.nextDouble();

        if (edad > 18) {
            double inscripcionAPagar;
            if (circuito == 1) {
                inscripcionAPagar = 1500;
            } else if (circuito == 2) {
                inscripcionAPagar = 2300;
            } else {
                inscripcionAPagar = 2800;
            }
            System.out.println("La inscripción a pagar es: " + inscripcionAPagar);
        }
    }
