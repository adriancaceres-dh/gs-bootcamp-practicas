import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dias");
        int cantidadDias = scanner.nextInt();
        int precioFinal = cantidadDias *2 ;

        System.out.println("El precio de campaña es " + precioFinal);
    }
}

