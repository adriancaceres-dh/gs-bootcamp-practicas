import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        //EJERCICIO 3

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de dias");
        int dias = scanner.nextInt();
        int resultado = dias * 2;

        System.out.println("Costo total es " + resultado);
    }
}
