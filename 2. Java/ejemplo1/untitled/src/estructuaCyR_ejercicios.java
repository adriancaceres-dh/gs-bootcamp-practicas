import java.util.Scanner;

public class estructuaCyR_ejercicios {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        System.out.println("Ingrese el valor de la prenda");

        double numeroFabrica = scanner.nextDouble();
        System.out.println("Ingrese la fabrica en la cual realizó la compra");

        if (numeroFabrica == 1) {
            double valor1 = valor + (valor * 0.07);
            valor1 = valor1 + (valor1 * 0.25);
        } //else if (numeroFabrica == 2) {



    }
}
