public class EjVectoresClases {
    public static void main(String[] args) {
        int[] numeros = {3,4,5,-2,4-8,5};
        System.out.println(numeros[4]);
       // System.out.println(numeros[6]); //esto da error (Bounds Exceptions)

        for (int i =0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //String[] nombres = {"Juan", "María", "Tomás"};
        String[] nombres = new String[3];
        nombres[0] = "Juan";
        nombres[1] = "María";
        nombres[2] = "Tomás";
        System.out.println(nombres[2]);


    }
}
