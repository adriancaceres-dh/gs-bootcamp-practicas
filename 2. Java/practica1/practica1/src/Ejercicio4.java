import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double  importePremio =scanner.nextDouble();
        double impuesto1 = importePremio * 2.45 / 100;
        double impuesto2 = importePremio * 15 / 100;
        double impuesto3 = importePremio * 3 / 100;

        System.out.println("Total sin impuestos $"+ (importePremio -impuesto1-impuesto2-impuesto3);
    }
}
