import java.util.Scanner;

public class Ej_2_Pg_Clase_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del sueldo");
        double sueldo = scanner.nextDouble();

        if (sueldo <= 20000){
            double sueldoPagar = sueldo + sueldo * 20 / 100;
            System.out.println("El sueldo a abonar con aumento es de $" + sueldoPagar);
        } else if (sueldo > 20000 && sueldo <= 45000){
            double sueldoPagar = sueldo + sueldo * 10 / 100;
            System.out.println("El sueldo a abonar con aumento es de $" + sueldoPagar);
        } else {
            double sueldoPagar = sueldo + sueldo * 5 / 100;
            System.out.println("El sueldo a abonar con aumento es de $" + sueldoPagar);
        }
    }
}
