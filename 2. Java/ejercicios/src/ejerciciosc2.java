//EJERCICIOS DE LA CLASE 2

//EJERCICIO N° 1
/*import java.util.Scanner;

public class ejerciciosc2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese precio de costo del producto: ");
        double precioCosto = sc.nextDouble();

        System.out.println("Ingrese numero de fabrica: ");
        double fabrica = sc.nextDouble();

        double precioConDistancia = 0;

        if (fabrica == 1){
            precioConDistancia = precioCosto + (precioCosto*7/100);
        } else if (fabrica == 2) {
            precioConDistancia = precioCosto + (precioCosto*15/100);
        } else if (fabrica == 3) {
            precioConDistancia = precioCosto + (precioCosto*22/100);
        }else {
            System.out.println("Elija fabrica 1, 2 o 3");
        }

        double precioFinal = precioConDistancia + (precioConDistancia*25/100);

        System.out.println("El precio final es: " + precioFinal);
    }
} */

//EJERCICIO N° 2

/*import java.util.Scanner;

public class ejerciciosc2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese DNI: ");
        int dni = sc.nextInt();

        System.out.println("Ingrese monto de sueldo: ");
        double sueldo = sc.nextDouble();

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

} */

//EJERCICIO N° 3

/*import java.util.Scanner;

public class ejerciciosc2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int clientes =1;

        while (clientes < 8){
            int clientesX = clientes++;

            System.out.println("Elija un Servicio: 1 o 2");
            int servicio = sc.nextInt();

            if (servicio == 1){
                System.out.println("El monto a pagar por el cliente " +clientesX+" es de $1500");
            }else {
                System.out.println("El monto a pagar por el cliente " + clientesX + " es de $2200");
            }
        }

        }
} */

//EJERCICIO N° 4

/*import java.util.Scanner;

public class ejerciciosc2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int usuarios = 0;

        int suscripcion1 = 0;
        int suscripcion2 = 0;
        int suscripcion3 = 0;
        int suscripcion4 = 0;
        int suscripcion5 = 0;

        while (usuarios < 51) {
            int usuariosX = usuarios++;

            System.out.println("Elija una suscripcion: \n1- a los 3 diarios , \n2- al Diario A y al Diario C, \n3- al Diario A y al Diario B, \n4- al Diario B y al Diario C o \n5- sólo al Diario A\n");
            int suscripcion = sc.nextInt();

            int suscripcion1X=0;
            int suscripcion2X=0;
            int suscripcion3X=0;
            int suscripcion4X=0;
            int suscripcion5X=0;

            if (suscripcion == 1) {
                suscripcion1X = suscripcion1++;
            } else if (suscripcion == 2) {
                suscripcion2X = suscripcion2++;
            } else if (suscripcion == 3) {
                suscripcion3X = suscripcion3++;
            } else if (suscripcion == 4) {
                suscripcion4X = suscripcion4++;
            } else if (suscripcion == 5) {
                suscripcion5X = suscripcion5++;
            }

            System.out.println(suscripcion1X+" personas estan suscriptas a los 3 diarios. \n"+ suscripcion2X+" personas estan suscriptas al diario A y C. \n" + suscripcion3X+" personas estan suscriptas al diario A y B. \n"+ suscripcion4X+" personas estan suscriptas al diario B y C. \n" + suscripcion5X+" personas estan suscriptas al diario A. \n" );

        }
    }
} */
