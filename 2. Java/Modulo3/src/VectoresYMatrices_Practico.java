public class VectoresYMatrices_Practico {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima",
                "Santiago de Chile", "Lisboa","Tokio"};
        int [ ] [ ] temperatura ={{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};
        int ciudadMaximo=0;
        int ciudadMinima=0;
        int temMinima = 0;
        int temMaxima = 0;
        int i = 0;
        for (int r = 0; r < temperatura.length; r++){
            for (int c =0; c<temperatura[r].length; c++){
                if (temperatura[r][c] > temMaxima) {
                    temMaxima = temperatura[r][c];
                    ciudadMaximo = c;
                }
                if (temperatura[r][c] < temMinima) {
                    temMinima = temperatura[r][c];
                    ciudadMinima = r;
                }

                }
            }
        System.out.println("La ciudad con la temperatura minima es " +ciudades[ciudadMinima]+ " con " +temMinima + " grados y la temperatura máxima fue "+ temMaxima + " en la ciudad de " + ciudades[ciudadMaximo]);
        }
    }
