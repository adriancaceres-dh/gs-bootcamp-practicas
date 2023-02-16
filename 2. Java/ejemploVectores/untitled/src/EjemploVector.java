public class EjemploVector {

    public static void main(String[] args) {

        int[] numeros = {3,4,5,-2,4-8,5};
        System.out.println(numeros[4]);
        // Esto da error ArrayIndexOutOfBoundsException
        // porque se va de rango (del tamaño del vector)
        // System.out.println(numeros[6]);
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
        // consigna
        // contar los positivos y los negativos del vector
        //





        // String[] nombres = {"Juan","Maria","Tomas"};
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Maria";
        nombres[2] = "Tomas";
        System.out.println(nombres[2]);


    }
}
