import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresé los días de campaña que va a realizar");
        double precioCampania = scanner.nextDouble()*2;
        System.out.println("El costo de su campaña en redes será " + precioCampania);
    }
}



