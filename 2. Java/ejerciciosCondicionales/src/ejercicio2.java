import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto del sueldo actual");
        double sueldo = scanner.nextDouble();
        double porcentaje = 0.0;
        if (sueldo <= 20000) {
            porcentaje = sueldo * 1.20;
        } else if (sueldo <= 45000) {
            porcentaje = sueldo * 0.10 + sueldo;
        } else {
            porcentaje = sueldo * 1.05;
        }
        System.out.println("El sueldo aumentó y llegó a la suma de $ " + porcentaje);
    }
}
