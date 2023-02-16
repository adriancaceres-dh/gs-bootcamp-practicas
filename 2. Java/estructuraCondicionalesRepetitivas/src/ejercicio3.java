import java.util.Scanner;

public class ejercicio3 {

        public static void main(String[] args) {
            Scanner clienteNumero = new Scanner(System.in);
            System.out.println("Ingrese numero de cliente");
            int cliente = clienteNumero.nextInt();

            Scanner servicio = new Scanner(System.in);
            System.out.println("Ingrese numero de servicio");

            int numeroServicio = servicio.nextInt();
            int seguridadConCamaras = 1500;
            int patrullaje = 700;
            int totalServicio1;
            int totalServicio2;

            totalServicio1 = seguridadConCamaras;
            totalServicio2 = seguridadConCamaras + patrullaje;

                 if (numeroServicio == 1) {
                System.out.println("El monto total a pagar es de " + totalServicio1);
            } else {
                System.out.println("El monto total a pagar es de " + totalServicio2);
            }

        }
    }

