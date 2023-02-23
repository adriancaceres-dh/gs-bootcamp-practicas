public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        double num3 = 81;
        System.out.println("El numero mayor entre: "+ num1 + " y " + num2 + " es "+ Calculos.numeroMayor(num1, num2) );
        System.out.println("El numero menor entre: "+ num1 + " y " + num2 + " es "+ Calculos.numeroMenor(num1, num2) );
        System.out.println("La potencia de " + num1+ " elevado a "+ num2 + " es " + Calculos.potencia(num1, num2));
        System.out.println("El coseno de un angulo de 30° es " + Calculos.coseno(30));
        System.out.println("La raiz cuadrada de " + num3 + " es " + Calculos.raiz(num3) );
        System.out.println("Numero aleatorio entre 0 y 999 = " + Calculos.numAleatorio());
    }
}