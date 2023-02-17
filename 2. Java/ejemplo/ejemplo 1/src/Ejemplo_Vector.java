public class Ejemplo_Vector {

    public static void main(String[] args) {

        // Array de numeros
        int[] numeros = {3, 4, 5, -2, 4 - 8, 5};
        //System.out.println(numeros[4]);

        // Array de String 1er metodo
        String[] nombre = {"Juan", "Maria", "Tomas"};
        //System.out.println(nombre[1]);

        // Array de String 2do metodo
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Maria";
        nombres[2] = "Tomas";
        //System.out.println(nombres[2]);

        // Recorrer Array con un "for"
        for (int i = 0; i < numeros.length; i++) {
            //System.out.println(numeros[i]);
        }

        // Sacar positivos y negativos
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                numerosPositivos++;
            } else {
                numerosNegativos++;
            }
        }
        System.out.println("Hay " + numerosPositivos + " numeros positivos y hay " + numerosNegativos + " numeros negativos");
    }
}
