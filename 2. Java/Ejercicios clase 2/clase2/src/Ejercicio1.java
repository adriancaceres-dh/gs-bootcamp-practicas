import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese precio de costo del producto: ");
            double precioCosto = scanner.nextDouble();


            System.out.println("Ingrese numero de fabrica: ");
            double fabrica = scanner.nextDouble();

            double precioConDistancia = 0;

            if (fabrica == 1){
                precioConDistancia = precioCosto + (precioCosto*7/100);
            } else if (fabrica == 2) {
                precioConDistancia = precioCosto + (precioCosto*15/100);
            } else if (fabrica == 3) {
                precioConDistancia = precioCosto + (precioCosto*22/100);
            }else {
                System.out.println("elija fabrica 1, 2 o 3");
            }

            double precioFinal = precioConDistancia + (precioConDistancia*25/100);

            System.out.println("El precio final es: " + precioFinal);

        }
    }
