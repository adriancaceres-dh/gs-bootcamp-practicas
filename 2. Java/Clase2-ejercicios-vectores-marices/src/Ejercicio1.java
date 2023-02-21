public class Ejercicio1 {
    public static void main(String[] args) {

        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{6,43},{0,39},{-7,26},{-1,31},{-10,35}};

        // min_value y max_value sirve porque si no hay temp mayores que cero, es decir todas son negativas, el cero se toma como máximo
        // o lo mismo con temp. min, podría no haber temperaturas mayores a cero

        int temperaturaMax = Integer.MIN_VALUE; // [0][0]
        int temperaturaMin = Integer.MAX_VALUE; //[0][1]
        String paisTemperaturaMax = "";
        String paisTemperaturaMin = "";

        // El for recorre el vector de temperaturas: f = temp. min y c temp. max
        for (int f=0; f < temperaturas.length; f++) {
            for (int c=0; c < temperaturas[f].length; c++) {
                if(temperaturas[f][c] > temperaturaMax){
                    temperaturaMax = temperaturas[f][c]; //guarda la temp. max.
                    paisTemperaturaMax = ciudades[f]; //guarda la ciudad
                }
                if(temperaturas[f][c] < temperaturaMin){
                    temperaturaMin = temperaturas[f][c];
                    paisTemperaturaMin = ciudades[f];
                }
            }
        }
        System.out.println("La temperatura máxima es de "+ temperaturaMax +"°"+ " en la ciudad de " + paisTemperaturaMax);
        System.out.println("La temperatura minima es de "+ temperaturaMin +"°"+ " en la ciudad de " + paisTemperaturaMax);
    }



}
