import java.util.Scanner;

public class EjemploCondicional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        if( numero > 10 ) {
            System.out.println("El numero ingresado es mayor que 10");
        } else if( numero < 10)  {
            System.out.println("El numero ingresado es menor que 10");
        } else {
            System.out.println("El numero ingresado es igual que 10");
        }

    }
}
