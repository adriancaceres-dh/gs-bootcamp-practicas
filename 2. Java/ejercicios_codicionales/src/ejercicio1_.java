import java.util.Scanner;

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
                System.out.println("El precio final del producto es: " + (double) Math.round(((costo * 1.07) * 1.25) * 100d) / 100);
                break;
            case 2:
                Scanner precio2 = new Scanner(System.in);
                System.out.println("Ingrese el precio del producto:");
                int costo2 = precio2.nextInt();
                System.out.println("El precio final del producto es: " + (double) Math.round(((costo2 * 1.15) * 1.25) * 100d) / 100);
                break;
            case 3:
                Scanner precio3 = new Scanner(System.in);
                System.out.println("Ingrese el precio del producto:");
                int costo3 = precio3.nextInt();
                System.out.println("El precio final del producto es: " + (double) Math.round(((costo3 * 1.22) * 1.25) * 100d) / 100);

                break;
            default:
                System.out.println("La fabrica no existe");
                break;
        }
    }
}
