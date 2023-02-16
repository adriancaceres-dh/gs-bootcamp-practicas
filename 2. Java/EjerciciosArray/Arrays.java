public class Arrays {
    public static void main(String[] args) {
        int[]numeros={3,4,5,7,(1+2),43};
        //System.out.println(numeros[4]);

        String[] nombres = {"Juan", "Maria", "Tomas"};

        //String[] nombres = new String[3];
        //nombres[0]="Juan";
        //nombres[1]="Maria";
        //es lo mismo que el de arriba.

        //Para recorrerlo se utiliza el for
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Ejercicio de ver positivos y negativos.

        int[]ejercicio={3,-4,-5,7,(1+2),43,9};
        int contadorP=0;
        int contadorN=0;

        for(int i=0; i<ejercicio.length; i++){
            if (ejercicio[i]>=0) {
                contadorP++;
            }else{
                contadorN++;
            }
        }
        System.out.println("hay positivos: "+contadorP);
        System.out.println("hay negativos: "+contadorN);


    }
}
