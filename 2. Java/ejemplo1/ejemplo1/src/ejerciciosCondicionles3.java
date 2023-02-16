import java.util.Scanner;

public class ejerciciosCondicionles3 {
        public static void main(String[] args) {
            for (int i = 1; i <= 7; i++) {

                Scanner scannerCliente = new Scanner(System.in);

                System.out.print("Ingrese número de cliente");

                int cliente = scannerCliente.nextInt();

                Scanner scannerServicio = new Scanner(System.in);

                System.out.print("Ingrese servicio contratado");

                double servicio = scannerServicio.nextInt();

                if (servicio == 1){
                    System.out.print("El costo final de la factura para el cliente" + cliente + "es $1500 \n");
                } else if (servicio == 2) {
                    System.out.print("El costo final de la factura para el cliente" + cliente + "es $2200 \n");
                } else {
                    System.out.print("Ingrese un servicio válido \n");
                }
            }

        }
    }
}
