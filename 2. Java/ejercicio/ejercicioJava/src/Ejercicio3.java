import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //usamos metodos del objeto
        System.out.println("Ingrese una cantidad de dias");
        int numero = scanner.nextInt();
        int precioFinal = numero * 2;


        System.out.println("El precio para " + numero + " dias de camapaña es de " + precioFinal);
    }

}
