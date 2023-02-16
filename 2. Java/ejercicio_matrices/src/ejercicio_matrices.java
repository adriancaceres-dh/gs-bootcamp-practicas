public class ejercicio_matrices {
   public static void main(String[] args) {

       String ciudades [] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Pablo", "Lima",
               "Santiago de Chile", "Lisboa", "Tokio"};

       int temperaturas [][]= {{-2,33}, {-3, 32}, {-8,27}, {4,37}, {6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};

       int temperaturaMaxima = 0;
       int temperaturaMinima = 0;
       int arrayFilaTemMin = 0;
       int arrayFilaTemMax = 0;

       for (int f=0; f<=9; f++) {
           for (int c=0; c<=1; c++) {
               if(temperaturaMaxima<temperaturas[f][c]){
                   temperaturaMaxima = temperaturas[f][c];
                   arrayFilaTemMax = f;
               }
               if(temperaturaMinima>temperaturas[f][c]){
                   temperaturaMinima = temperaturas[f][c];
                   arrayFilaTemMin = f;
               }
           }
       }
       System.out.println("La temperatura máxima registrada fue de "+ temperaturaMaxima+"°"+" en la ciudad de "+ ciudades[arrayFilaTemMax]);
       System.out.println("La temperatura minima registrada fue de "+ temperaturaMinima+"°"+" en la ciudad de "+ ciudades[arrayFilaTemMin]);
    }

}