import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        System.out.println("Ingrese el precio de costo del producto");

        double numeroDeFabrica = scanner.nextDouble();
        System.out.println("Ingrese el numero de fabrica");
        if(numeroDeFabrica == 1){
            double valor1= valor + (valor * 0.07);
            valor1 = valor1+ (valor1 * 0.25);
            System.out.println(valor1);
        } else if (numeroDeFabrica == 2){
            double valor2= valor + (valor * 0.15);
            valor2 = valor2+ (valor2 * 0.25);
            System.out.println(valor2);
        } else if (numeroDeFabrica == 3){
            double valor3= valor + (valor * 0.15);
            valor3 = valor3+ (valor3 * 0.25);
            System.out.println(valor3);
        }else {
            System.out.println("El numero de la fabrica no se encuentra");
        }
    }
}
