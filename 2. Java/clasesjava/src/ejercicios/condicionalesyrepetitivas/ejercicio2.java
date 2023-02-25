package ejercicios.condicionalesyrepetitivas;

import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese DNI: ");
            int dni = sc.nextInt();

            System.out.println("Ingrese monto de sueldo: ");
            double sueldo = sc.nextDouble();

            double sueldoFinal = 0;

            if (sueldo <= 20000){
                sueldoFinal =  sueldo +(sueldo*0.20);
            } else if (sueldo>20000 && sueldo <= 45000) {
                sueldoFinal =  sueldo +(sueldo*0.10);
            } else{
                sueldoFinal =  sueldo +(sueldo*0.05);
            }

            System.out.println("El sueldo final es: " + sueldoFinal);
        }
}
