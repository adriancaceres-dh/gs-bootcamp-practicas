public class Ejercicio {
    public static void main(String[] args) {

        int[] numbers = {3,4,5,6,4,-8,5};
        int[] resultados = {0,0}; // posicion 0, suma positivos, posicion 1, suma neg.
        //int positivo = 0;
        //int negativo = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] >= 0){
                //positivo++;
                resultados[0]++;
            } else {
                //negativo++;
                resultados[1]++;
            }
        }
//        System.out.println("hay " + positivo + " numeros positivos");
//        System.out.println("hay " + negativo + " numeros negativos");
        System.out.println("hay " + resultados[0] + " numeros positivos");
        System.out.println("hay " + resultados[1] + " numeros negativos");

    }
}
