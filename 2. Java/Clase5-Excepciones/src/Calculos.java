public class Calculos {
    public static int numeroMayor(int numero1, int numero2){
        return Math.max(numero1, numero2);
    }

    public static int numeroMenor(int numero1, int numero2){
        return Math.min(numero1, numero2);
    }

    public static double potencia(int base, int exponente){
        return Math.pow(base, exponente);
    }

    public static double coseno(double angulo){
        return Math.cos(angulo);
    }

    public static double raiz(double numero){
        return Math.sqrt(numero);
    }

    public static int aleatorio(int num1, int num2){
        return (int) (Math.random() * (num1 - num2 + 1) +num2);
    }
}
