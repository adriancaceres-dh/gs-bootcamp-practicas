import java.util.Scanner;

public class Ejercicio3Playground {
    public static void main(String[] args) {
        /*
      Un Community Manager desea llevar a cabo una campaña publicitaria para uno de sus clientes en Instagram.
      Para ello, necesita una aplicación que sea capaz de calcular el costo total de la campaña a partir
      de la otorgación de la cantidad de días que dura la misma.
      El precio por día de campaña es de $2 dólares fijos.
      Realizar un programa que a partir del ingreso de la cantidad de días,
      devuelva por pantalla el monto total.
      Por ejemplo:
                  5 días de campaña → $2 * 5 = $10
                  8 días de campaña → $2 * 8 = $16

         */
        Scanner scanner = new Scanner(System.in);
        int porcentajeFinal;
        System.out.println("Ingresar cantidad de dias");
        int ingresoDeVentas = scanner.nextInt();
        System.out.println("Ingresar Monto Total");
        int montoTotal = scanner.nextInt();
        porcentajeFinal = montoTotal * ingresoDeVentas;
        System.out.println("El monto total es " + porcentajeFinal);


    }
}
