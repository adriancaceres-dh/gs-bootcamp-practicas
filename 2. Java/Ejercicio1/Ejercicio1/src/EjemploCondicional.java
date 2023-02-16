import java.util.Scanner;

public class EjemploCondicional {
    public static void main(String[] args)
    {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresar Primer Numero");
        int num1 = scanner.nextInt();
            System.out.println("Ingresar Segundo Numero");
        int num2= scanner.nextInt();

        if (num2 > num1) {
            System.out.println("el num2 es mayor al num1");
        }
        else{
            if (num1 == num2) {
                System.out.println("los numero son iguales");
            }
            else{
                System.out.println(" el num1 es mayor al num2");
            }} }}
}
