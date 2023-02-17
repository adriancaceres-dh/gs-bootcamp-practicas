import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el precio de costo");
        int precioCosto = scanner.nextInt();


        System.out.println("ingrese el numero de fabrica en la cual compro");
        int numeroFabrica = scanner.nextInt();

        int por = precioCosto * 7 / 100;
        int por2 = precioCosto * 15 / 100;
        int por3 = precioCosto * 22 / 100;

        int precioTotal =por *25 /100;
        int precioTotal2 = por2 * 25 / 100;
        int precioTotal3= por3 * 25 / 100;

        if(numeroFabrica == 1){
            int total=precioCosto + por+precioTotal;
            System.out.println("el costo de venta es de $"+total);
        } else {
            if (numeroFabrica == 2){
                int total2=precioCosto + por2+precioTotal2;
                System.out.println("el costo de venta es de $"+total2);
            }
            else{
                if(numeroFabrica == 3);
                int total3=precioCosto + por3+precioTotal3;
                System.out.println("el costo de venta es de $"+total3);
            }
        }
    }

}