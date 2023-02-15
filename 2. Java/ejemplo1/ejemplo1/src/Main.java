import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();
        System.out.println("El numero ingresado es " + numero);

        System.out.println("ingrese un nombre");
        String nombre =scanner.next();
        System.out.println("el nombre ingresado es " + nombre);
    }
}