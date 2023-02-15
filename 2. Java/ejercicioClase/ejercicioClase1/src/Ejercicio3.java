import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner quantityDays = new Scanner(System.in);

        System.out.print("Enter the number of days the campaign will last: ");

        int days = quantityDays.nextInt();

        double totalCost = days * 2.0;

        System.out.println("The total cost of the campaign is $" + totalCost);
    }
}
