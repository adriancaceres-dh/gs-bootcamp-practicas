import java.util.Arrays;
import java.util.Scanner;

public class EjercicioVectores {
    public static void main(String[] args) {

        String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile",
        "Lisboa", "Tokio"};
        int aux;
        int [][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37},{6, 42}, {5, 43}, {0, 39}, {-7,26},{-1,31},{-10,35}};

        int tempMax = 0, tempMin = 0, filaTempMin = 0, filaTempMax = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (tempMax < temperaturas[i][j]){
                    tempMax = temperaturas[i][j];
                    filaTempMax = i+1;
                }
                System.out.println(temperaturas[i][j]);
                if (tempMin > temperaturas[i][j]){
                    tempMin = temperaturas[i][j];
                    filaTempMin = i+1;
                }
            }
        }
        System.out.println("La temperatura maxima fue de " + filaTempMax + "° en la ciudad de " + cities[filaTempMax-1]);
        System.out.println("La temperatura minima fue de " + filaTempMin + "° en la ciudad de " + cities[filaTempMin-1]);
    }
}
