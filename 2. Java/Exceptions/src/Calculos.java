import java.util.Random;
public class Calculos {

    public static double esMayor(double num1, double num2){
        return Math.max(num1, num2);
    }

    public static double esMenor(double num1, double num2){
        return Math.min(num1, num2);
    }

    public static double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public static double coseno(double angulo){
        return Math.cos(angulo);
    }

    public static double raizCuadrada(double num){
        return Math.sqrt(num);
    }

    public static int numeroAleatorio() {
        Random random = new Random();
        return random.nextInt(1000);
    }

}
