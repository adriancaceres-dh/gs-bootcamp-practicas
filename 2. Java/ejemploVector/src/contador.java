public class contador {
    public static void main(String[] args) {
        int[] numeros = {3,2,-4,7,-1,-2,0};
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i<numeros.length; i++) {
            if (numeros[i]<0) {
                negativos++;
            } else {
                positivos++;
            }
        }
        System.out.println("la cantidad de positivos son: " + positivos);
        System.out.println(("la cantidad de negativos son: " + negativos));
    }
}
