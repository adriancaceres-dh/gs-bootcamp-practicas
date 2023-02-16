import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner dni = new Scanner(System.in);
        System.out.println("Ingresar el DNI del empleado: ");
        int dniEmpleado = dni.nextInt();

        Scanner sueldo = new Scanner(System.in);
        System.out.println("Ingresá el sueldo del empleado: ");
        double sueldoEmpleado = sueldo.nextDouble();

        if(sueldoEmpleado <= 20000){
            double sueldoAPagar = sueldoEmpleado * 0.20 + sueldoEmpleado;
            System.out.println("Le corresponde un 20% de aumento. Su nuevo sueldo es de: $" + sueldoAPagar);
        }else if(sueldoEmpleado > 20000 && sueldoEmpleado <= 45000){
            double sueldoAPagar = sueldoEmpleado * 0.10 + sueldoEmpleado;
            System.out.println("Le corresponde un 10% de aumento. Su nuevo sueldo es de: $" + sueldoAPagar);
        }else{
            double sueldoAPagar = sueldoEmpleado * 0.05 + sueldoEmpleado;
            System.out.println("Le corresponde un 5% de aumento. Su nuevo sueldo es de: $" + sueldoAPagar);
        }

    }
}
