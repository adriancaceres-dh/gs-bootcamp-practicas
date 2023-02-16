public class Main {
    public static void main(String[] args) {

        String[] ciudades = {"Londres","Madrid","Nueva York","Bs As", "Asuncion", "San Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
       int [][] temperaturas = {{-2,-3,-8,4,6,5,0,-7,-1,-10}, {33,32,27,37,42,43,39,26,31,35}};

       int max = temperaturas[0][0];
       int min = temperaturas[0][0];
       int indiceMin = -1;
        int indiceMax = -1;

       for(int f = 0; f < temperaturas.length; f++){
           for(int c = 0; c < temperaturas[f].length; c++){
               if(temperaturas[f][c] < min){
                   min = temperaturas[f][c];
                   indiceMin = c;
               }
               if(temperaturas[f][c] > max){
                   max = temperaturas[f][c];
                   indiceMax = c;
               }
           }
       }


        System.out.println("El valor mínimo es: " + min + ". Registrada en la ciudad de: " + ciudades[indiceMin] + ".");
        System.out.println("El valor máximo es: " + max + ". Registrada en la ciudad de: " + ciudades[indiceMax] + ".");
    }
}