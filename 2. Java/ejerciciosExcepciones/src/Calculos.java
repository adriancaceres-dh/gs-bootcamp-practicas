import java.util.Random;

public class Calculos {
    public static int numeroMayor(int num1, int num2) {
      return Math.max(num1, num2);
    }
    public static int numeroMenor(int num1, int num2) {
        return Math.min(num1, num2);
    }
    public static double potencia(int base, int exp) {
        return Math.pow(base, exp);
    }
    public static double coseno(int angulo){
        return Math.cos(angulo);
    }
    public static double raiz(double num){
        return Math.sqrt(num);
    }
    public static int numAleatorio(){
        Random rand = new Random();
        int numAleatorio = rand.nextInt(1000);
        return numAleatorio;
    }
}
