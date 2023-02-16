import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el costo del producto");
        int costoProducto = scanner.nextInt();
        System.out.println("Ingrese la fabrica");
        int fabrica = scanner.nextInt();

        double costoFinal = 0;

        switch (fabrica){
            case 1: costoFinal = (costoProducto * 1.07) * 1.25;
                break;
            case 2: costoFinal = (costoProducto * 1.15) * 1.25;
                break;
            case 3: costoFinal = (costoProducto * 1.22) * 1.25;
                break;
            default: System.out.println("No existe la fabrica especificada");
        }
        System.out.println("El precio de venta es: $" + costoFinal);

    }
}

