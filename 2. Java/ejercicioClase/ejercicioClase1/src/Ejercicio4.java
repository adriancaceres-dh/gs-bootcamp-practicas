import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner importAward = new Scanner(System.in);

        System.out.print("Enter the total prize won: ");

        int award = importAward.nextInt();

        double tax = award * 0.2045;

        double finalAward = award - tax;

        System.out.println("The total prize won is $" + finalAward);
    }
}
