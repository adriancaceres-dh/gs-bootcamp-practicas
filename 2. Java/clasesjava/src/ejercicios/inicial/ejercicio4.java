package ejercicios.inicial;

import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto de su premio");
        double valorPremio = sc.nextDouble();

        double impuesto1 = valorPremio * 0.0245;
        double impuesto2 = valorPremio * 0.15;
        double impuesto3 = valorPremio *0.03;

        double premioFinal = valorPremio - impuesto1 - impuesto2 - impuesto3;

        System.out.println(premioFinal);
    }
}
