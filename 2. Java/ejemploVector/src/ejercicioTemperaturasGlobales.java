import java.security.spec.RSAOtherPrimeInfo;

public class ejercicioTemperaturasGlobales {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        //System.out.println(temperaturas.length);
        int tempMax = 0;
        int tempMin = temperaturas[0][0];
        int indiceMax = temperaturas[0][1];
        int indiceMin = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            //System.out.println(temperaturas[i][1]);

            if (temperaturas[i][0] < tempMin) {
                tempMin = temperaturas[i][0];
                indiceMin = i;
            }
            if (temperaturas[i][1] > tempMax) {
                tempMax = temperaturas[i][1];
                indiceMax = i;
            }
        }
        System.out.println("la ciudad con la temperatura mas baja fue " + ciudades[indiceMax] + " y la misma fue de " + tempMax);
        System.out.println("la ciudad con la temperatura mas baja fue " + ciudades[indiceMin] + " y la misma fue de " + tempMin);
    }
}
