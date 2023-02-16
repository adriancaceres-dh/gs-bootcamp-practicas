public class conteoPositivosNegativos {

    public static void main(String[] args) {
        int positivos = 0;
        int negativos = 0;
        int numeros [] = {1,2,3,4,5,6, -1,-2,-3,-4,-5};

        for (int i=0; i<numeros.length; i++){
            if(numeros[i]>=0){
                positivos++;
            } else {
                negativos++;
            }
        }
        System.out.println("los numeros negativos son en total: " + negativos);
        System.out.println("Los numeros activos son en total: " + positivos);
    }
}
