//Ejercicio 4
public class Calculos {
    public static int numMayor(int num1, int num2) {
        return Math.max(num1, num2);
    }
    public static int numMenor(int num1, int num2) {return Math.min(num1, num2);}
    public static double potencia(double numero, double potencia) {
        return Math.pow(numero, potencia);
    }
    public static double coseno(double angulo) {
        return Math.cos(angulo);
    }
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }
    public static int numAleatorio() {
        return (int) (Math.random() * 1000);
    }
}
