package ejercicios.condicionalesyrepetitivas;

import java.util.Scanner;

public class ejercicio3 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int clientes =1;

            while (clientes < 8){
                int clientesX = clientes++;

                System.out.println("Elija un Servicio: 1 o 2");
                int servicio = sc.nextInt();

                if (servicio == 1){
                    System.out.println("El monto a pagar por el cliente " +clientesX+" es de $1500");
                }else {
                    System.out.println("El monto a pagar por el cliente " + clientesX + " es de $2200");
                }
            }

        }
}
