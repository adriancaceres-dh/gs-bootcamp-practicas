import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int dias=scanner.nextInt();
        int valorTotal=dias*2;
        System.out.println(valorTotal);
        System.out.println("el costo total de la campaña es de "+valorTotal);
    }
}
