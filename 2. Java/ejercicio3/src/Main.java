import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de dias total de la campañia");

       int days = scanner.nextInt();
       int priceDay = 2;
       int totalPrice = days * priceDay;

       System.out.println("el precio total de la campañia es de $ " + totalPrice);
    }
}