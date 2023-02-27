import java.util.Scanner;
public class EstructuraControl1 {
    public static void main(String[] args) {

        Scanner scannerPrecio = new Scanner(System.in);

        System.out.print("Ingrese el precio de costo: ");

        double precioCosto = scannerPrecio.nextInt();

        Scanner scannerFabrica = new Scanner(System.in);

        System.out.print("Ingrese número fabrica: ");

        int fabrica = scannerFabrica.nextInt();

        double ganancia = 1.25;

        double costoEnvio1 = 1.07;
        double costoEnvio2 = 1.15;
        double costoEnvio3 = 1.22;

        if (fabrica == 1) {
            double precioVenta = precioCosto * costoEnvio1 * ganancia;
            System.out.println("El precio de venta es: $" + (double) Math.round(precioVenta * 100d) / 100);

        } else if (fabrica == 2) {
            double precioVenta = precioCosto * costoEnvio2 * ganancia;
            System.out.println("El precio de venta es: $" + (double) Math.round(precioVenta * 100d) / 100);
        } else if (fabrica == 3) {
            double precioVenta = precioCosto * costoEnvio3 * ganancia;
            System.out.println("El precio de venta es: $" + (double) Math.round(precioVenta * 100d) / 100);
        } else {
            System.out.print("Fabrica no disponible");
        }
    }
}
    //OTRA FORMA DE HACERLO

    /*import java.util.Scanner;

    public class ejercicio1_ {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Indique en que fabrica compro el producto: \n1: Fabrica N°1 \n2: Fabrica N°2 \n3: Fabrica N°3");
            int empresa = entrada.nextInt();

            switch (empresa) {
                case 1:
                    Scanner precio = new Scanner(System.in);
                    System.out.println("Ingrese el precio del producto:");
                    int costo = precio.nextInt();
                    System.out.println("El precio final del producto es: " + (double)Math.round(((costo * 1.07) * 1.25)*100d)/100);
                    break;
                case 2:
                    Scanner precio2 = new Scanner(System.in);
                    System.out.println("Ingrese el precio del producto:");
                    int costo2 = precio2.nextInt();
                    System.out.println("El precio final del producto es: " + (double)Math.round(((costo2 * 1.15) * 1.25)*100d)/100);

            }*/
