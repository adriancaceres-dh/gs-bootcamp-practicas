import java.util.Scanner;

public class EjerciciosPlaygroundEstructurasCondicionalesRepetitivas {
    public static void main(String[] args) {
        /*
        //ejercicio 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la prenda");
        double valor= scanner.nextDouble();


        System.out.println("Ingrese la fabrica");
        double numeroFabrica= scanner.nextDouble();

        if(numeroFabrica == 1){
            double valor1 = valor + (valor * 0.07);
            valor1 = valor1 + (valor1 * 0.25);
            System.out.println(valor1);
        }else if (numeroFabrica == 2){
            double valor2= valor + (valor * 0.15);
            valor2 = valor2 + (valor2 * 0.25);
            System.out.println(valor2);
        }else if (numeroFabrica == 3){
            double valor3= valor + (valor * 0.22);
            valor3 = valor3 + (valor3 * 0.25);
            System.out.println(valor3);
        }else{
            System.out.println("El numero de la fabrica no se encuentra");
        }
*/
       /*
        //ejercicio 2


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
        }else{
            System.out.println("Le corresponde un 5% de aumento");
        }
*/
/*
        //ejercicio 3

        Scanner clienteNumero = new Scanner(System.in);
        System.out.println("Ingrese numero de cliente");
        int cliente = clienteNumero.nextInt();

        Scanner servicio = new Scanner(System.in);
        System.out.println("Ingrese numero de servicio");
        int numeroServicio = servicio.nextInt();


        int seguridadConCamaras = 1500;
        int patrullaje = 700;
        int totalServicio1;
        int totalServicio2;

        totalServicio1 = seguridadConCamaras;
        totalServicio2 = seguridadConCamaras + patrullaje;


        if (numeroServicio == 1) {
            System.out.println("El monto total a pagar es de " + totalServicio1);
        } else {
                System.out.println("El monto total a pagar es de " + totalServicio2);
        }
*/
/*
        //ejercicio 4 (lo hicimos de 5 personas para que no sea tan largo)
        Scanner scanner = new Scanner(System.in);
        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        int cantSuscriptoresTodos = 0;
        int cantSuscriptoresAyC = 0;
        int cantSuscriptoresAyB = 0;
        int cantSuscriptoresByC = 0;
        int cantSuscriptoresA = 0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("suscripto al diario A 1-si 0-no");
            diarioA = scanner.nextInt();
            System.out.println("suscripto al diario B 1-si 0-no");
            diarioB = scanner.nextInt();
            System.out.println("suscripto al diario C 1-si 0-no");
            diarioC = scanner.nextInt();

            if (diarioA == 1 && diarioB == 1 && diarioC == 1) {
                cantSuscriptoresTodos++;
            } else if (diarioA == 1 && diarioC == 1) {
                cantSuscriptoresAyC++;
            } else if (diarioA == 1 && diarioB == 1) {
                cantSuscriptoresAyB++;
            } else if (diarioB == 1 && diarioC == 1) {
                cantSuscriptoresByC++;
            } else if (diarioA == 1) {
                cantSuscriptoresA++;
            }

        }
        System.out.println("los suscriptores a todos los diarios son: " + cantSuscriptoresTodos );
        System.out.println("los suscriptores a los diarios AyC son: " + cantSuscriptoresAyC );
        System.out.println("los suscriptores a los diarios AyB son: " + cantSuscriptoresAyB );
        System.out.println("los suscriptores a los diarios ByC son: " + cantSuscriptoresByC );
        System.out.println("los suscriptores al diario Ason: " + cantSuscriptoresA );
        */
 */
    }
}
