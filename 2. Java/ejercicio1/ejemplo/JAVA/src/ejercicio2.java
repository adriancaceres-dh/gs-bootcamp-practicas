import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner dni = new Scanner(System.in);
        System.out.println("Ingrese un DNI");
        int numeroDni = dni.nextInt();
        Scanner sueldo = new Scanner(System.in);
        System.out.println("Ingresá el sueldo del empleado");
        double sueldoEmpleado = sueldo.nextDouble();

        if(sueldoEmpleado <= 20000){
            System.out.println("Le corresponde un 20% de aumento");
        }else if(sueldoEmpleado > 20000 && sueldoEmpleado <= 45000){
            System.out.println("Le corresponde un 10% de aumento");
        }else {System.out.println("Le corresponde un 5% de aumento");         }

    }
}
