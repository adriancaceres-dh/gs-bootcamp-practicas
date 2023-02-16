public class EjVectoresPosyNeg {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 5, -2, 4 - 8, 5};

      int negativos = 0;
      int positivos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] >= 0){
                positivos++;
            }
            else {
                negativos++;
            }
            System.out.println("hay " + positivos + " números positivos");
            System.out.println("hay " + negativos + " números negativos");
        }

    }
}


