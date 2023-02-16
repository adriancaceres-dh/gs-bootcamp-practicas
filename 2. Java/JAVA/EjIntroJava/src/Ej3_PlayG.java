import java.util.Scanner;

public class Ej3_PlayG {
/* Un Community Manager desea llevar a cabo una campaña publicitaria para uno de sus clientes en Instagram.
     Para ello, necesita una aplicación que sea capaz de calcular el costo total de la campaña a partir de la
     otorgación de la cantidad de días que dura la misma.
     El precio por día de campaña es de $2 dólares fijos. Realizar un programa que a partir del ingreso de la
     cantidad de días, devuelva por pantalla el monto total.
     Por ejemplo:
     5 días de campaña → $2 * 5 = $10
     8 días de campaña → $2 * 8 = $16
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de días");
        double cantidadDias = scanner.nextDouble();

        double precioPorDiaCampana = 2;
        double costoTotalCampana = precioPorDiaCampana * cantidadDias;
        System.out.println("El costo total de la campaña es " + costoTotalCampana);
    }
}
