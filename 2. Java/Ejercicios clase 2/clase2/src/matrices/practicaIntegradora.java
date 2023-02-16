import java.util.Scanner;

public class practicaIntegradora {

    public static void main(String[] args) {

        // Vector con los nombres de las ciudades
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        // Matriz de dos columnas que especifica la temperatura máxima y mínima de cada ciudad
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42},
                {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        // Variables para almacenar la temperatura máxima y mínima, y sus respectivas ciudades
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        String ciudadMax = "";
        String ciudadMin = "";

// Recorremos la matriz de temperaturas y actualizamos los valores máximo y mínimo
        for (int i = 0; i < temperaturas.length; i++) {
            int maxTempCiudad = temperaturas[i][1];
            int minTempCiudad = temperaturas[i][0];
            if (maxTempCiudad > tempMax) {
                tempMax = maxTempCiudad;
                ciudadMax = ciudades[i];
            }
            if (minTempCiudad < tempMin) {
                tempMin = minTempCiudad;
                ciudadMin = ciudades[i];
            }
        }

        // Mostramos los resultados
        System.out.println("La temperatura máxima registrada entre todas las ciudades fue de " + tempMax + " grados Celsius, en " + ciudadMax + ".");
        System.out.println("La temperatura mínima registrada entre todas las ciudades fue de " + tempMin + " grados Celsius, en " + ciudadMin + ".");
    }
}