import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el total de su premio");
        double importeBruto = scanner.nextInt();
        double impuesto1 = importeBruto * 2.45 / 100;
        double impuesto2 = importeBruto * 15 / 100;
        double impuesto3 = importeBruto * 3 / 100;
        double premioSinImpuestos = importeBruto - impuesto1 - impuesto2 - impuesto3;

        System.out.println("el premio burto es de " + premioSinImpuestos);


    }

}