import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese DNI: ");
        int dni = scanner.nextInt();

        System.out.println("Ingrese monto de sueldo: ");
        double sueldo = scanner.nextDouble();

        //Si el sueldo es menor o igual a $20.000 le corresponde un 20% de aumento.
        //b. Si el sueldo es mayor a $20.000 pero menor o igual a $45.000 le corresponde un 10% de aumento.
        
        double sueldoFinal = 0;
        
        if (sueldo <= 20000){
            sueldoFinal =  sueldo +(sueldo*0.20);
        } else if (sueldo>20000 && sueldo <= 45000) {
            sueldoFinal =  sueldo +(sueldo*0.10);
        } else{
            sueldoFinal =  sueldo +(sueldo*0.05);
        }
        System.out.println("El sueldo final es: " + sueldoFinal);
    }

}
