import java.util.Scanner;

public class Ejercicio2Estrc {
    public static void main(String[] args) {
        Scanner dni = new Scanner(System.in);

        System.out.print("Ingrese su número de DNI ");

        int dniIngresado = dni.nextInt();

        Scanner sueldo = new Scanner(System.in);

        System.out.print("Ingrese el su salario ");

        int sueldoIngresado = sueldo.nextInt();

        if (sueldoIngresado <= 20000){
            double resultado = (sueldoIngresado * 20) / 100;
            System.out.print("El aumento que le corresponde es de " + resultado + ", su sueldo sería de " + (sueldoIngresado + resultado));

        } else if (sueldoIngresado <= 45000) {
            double resultado = (sueldoIngresado * 10) / 100;
            System.out.print("El aumento que le corresponde es de " + resultado + ", su sueldo sería de " + (sueldoIngresado + resultado));
        } else if (sueldoIngresado > 45000) {
            double resultado = (sueldoIngresado * 5) / 100;
            System.out.print("El aumento que le corresponde es de " + resultado + ", su sueldo sería de " + (sueldoIngresado + resultado));
        } else {
            System.out.print("A su sueldo no le corresponde aumento");
        }

    }

    }

