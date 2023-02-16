public class Main {
    public static void main(String[] args) {

        int[] numeros = {3,4,5,-2,4-8,5};
        System.out.println(numeros[4]);

        for (int indice = 0; indice< numeros.length; indice++) {
            System.out.println(numeros[indice]);
            //alt + j -> vas buscando ocurrencias de la seleccion
        }
        // String[] nombres = {"Juan", "Ale", "Clara"};
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "Ale";
        nombres[2] = "Clara";
        System.out.println(nombres[2]);
    }
}