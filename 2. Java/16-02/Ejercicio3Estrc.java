import java.util.Scanner;

public class Ejercicio3Estrc {
    public static void main(String[] args) {
        Scanner persona = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");

        String personaIngresada = persona.next();

        Scanner servicio = new Scanner(System.in);

        System.out.print("Elija el servicio 1 o 2: ");

        int servicioElegido = servicio.nextInt();
        int costoServ;
        //COMO ODIO SWTICH HERMANO
        switch (servicioElegido){
            case 1: costoServ = 1500;
            System.out.print("El costo de su servicio es " + costoServ);
            break;
            case 2: costoServ = 2200;
            System.out.print("El costo de su servicio es " + costoServ);
            break;
            default:System.out.print("No selecciono ningún servicio habilitado");
        }

    }
}
