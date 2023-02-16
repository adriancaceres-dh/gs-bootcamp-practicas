import java.util.Scanner;

public class Ej_3_Pg_Clase_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresar nombre de cliente");
            String nombre = scanner.next();
            System.out.println("Ingrese numero de servicio");
            int numeroServicio = scanner.nextInt();

            if (numeroServicio == 1){
                System.out.println(nombre + " debe abonar $ 1500");
            } else if (numeroServicio == 2) {
                System.out.println(nombre + " Debe abonar $ 2000");
            } else {
                System.out.println("El nro de servicio es incorrecto, debe ser 1 o 2");
            }
        }
    }
}
