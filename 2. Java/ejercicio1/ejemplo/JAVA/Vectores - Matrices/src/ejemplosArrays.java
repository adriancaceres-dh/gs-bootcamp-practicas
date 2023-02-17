public class ejemplosArrays {
    public static void main(String[] args) {
        //Consigna: contar los positivos y los negativos del vector
        int[] numeros = {3, 4, 5, 8, - 4, -2, 0, -3};
        int positivos = 0;
        int negativos = 0;
        int i;
        for (i = 0; i < numeros.length; i++) {
        }
        if (numeros[i] >= 0){
            positivos++;
        } else{
            negativos++;
        }
        System.out.println("hay " + positivos);
        System.out.println("hay " + negativos);

        /*System.out.println(numeros [3]);*/ //solocitamos el indice
        /*for (indice = 0; indice < numeros.length; indice++) ;
        System.out.println(numeros[indice]); //recorre el array*/
    /*String [] nombres = {"Juan","Jose","Jesica"};
    System.out.println(nombres[2]);*/ //Array de string
    }
}
