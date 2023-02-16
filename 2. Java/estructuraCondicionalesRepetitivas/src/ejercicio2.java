import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner dni = new Scanner(System.in);
        System.out.println("Ingrese un DNI");
        long numeroDni = dni.nextLong();

        Scanner sueldo = new Scanner(System.in);
        System.out.println("Ingresá el sueldo del empleado");
        double sueldoEmpleado = sueldo.nextDouble();

        if(sueldoEmpleado <= 20000){
            double sueldoUno = sueldoEmpleado + (sueldoEmpleado + (sueldoEmpleado * 0.20));
            System.out.println("dni: " + numeroDni);
            System.out.println("Le corresponde un 20% de aumento");
            System.out.println("sueldo total: " + sueldoUno);
        }else if(sueldoEmpleado > 20000 && sueldoEmpleado <= 45000){
            double sueldoDos = sueldoEmpleado + (sueldoEmpleado + (sueldoEmpleado * 0.10));
            System.out.println("dni: " + numeroDni);
            System.out.println("Le corresponde un 10% de aumento");
            System.out.println("sueldo total: " + sueldoDos);
        }else{
            double sueldoTres = sueldoEmpleado + (sueldoEmpleado + (sueldoEmpleado * 0.05));
            System.out.println("dni: " + numeroDni);
            System.out.println("Le corresponde un 5% de aumento");
            System.out.println("sueldo total: " + sueldoTres);
        }

    }
}
