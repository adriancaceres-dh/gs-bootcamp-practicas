public class ejercicioVectores {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42},
                {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        //almacenar la temperatura máxima y mínima
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        String ciudadMax = "";
        String ciudadMin = "";
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
        System.out.println("La temperatura máxima registrada entre todas las ciudades fue de " + tempMax + " grados Celsius, en " + ciudadMax + ".");
        System.out.println("La temperatura mínima registrada entre todas las ciudades fue de " + tempMin + " grados Celsius, en " + ciudadMin + ".");
    }
    }

