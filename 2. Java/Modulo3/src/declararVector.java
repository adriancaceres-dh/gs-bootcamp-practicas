import java.util.Scanner;

public class declararVector {
    public static void main(String[] args) {
        int []numeros ={3,4,5,-2,4-8,5};
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        Scanner scanner = new Scanner (System.in);
        for(int i=0; i< numeros.length; i++)
        if (numeros [i]>=0) {
            contadorPositivo++;
        }
        else{
            contadorNegativo++;
        }
        System.out.println("Los nunmeros positivos del vector son "+ contadorPositivo +" y los negativos son "+ contadorNegativo);
        }

}
