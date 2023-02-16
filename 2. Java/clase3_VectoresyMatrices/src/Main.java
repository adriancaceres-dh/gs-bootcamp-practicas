public class Main {
    public static void main(String[] args) {
        String[] ciudades = {"Londres","Madrid","Nueva York","Bs As", "Asuncion", "San Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int [][] temperaturas = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};

           int max = 0;
           int min = 0;
           int indiceMin = 0;
           int indiceMax = 0;

           for(int f = 0; f < temperaturas.length; f++){
               for(int c = 0; c < temperaturas[f].length; c++){
                   if(temperaturas[f][c] < min){
                       min = temperaturas[f][c];
                       indiceMin = f;
                   }
                   if(temperaturas[f][c] > max){
                       max = temperaturas[f][c];
                       indiceMax = f;
                   }
               }
           }
            System.out.println("El valor mínimo es: " + min + ". Registrada en la ciudad de: " + ciudades[indiceMin] + ".");
            System.out.println("El valor máximo es: " + max + ". Registrada en la ciudad de: " + ciudades[indiceMax] + ".");
        }
}