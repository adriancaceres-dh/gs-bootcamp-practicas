public class Ejercicio1 {
        public static void main(String[] args) {
            String[] ciudades = new String[]{"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
            int[][] temperaturas = new int[][]{{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
            int indiceMaximo = 0;
            int indiceMinimo = 0;
            int temperaturaMínima = 0;
            int temperaturaMaxima = 0;

            for(int f = 0; f < temperaturas.length; ++f) {
                for(int c = 0; c < temperaturas[f].length; ++c) {
                    if (temperaturas[f][c] > temperaturaMaxima) {
                        temperaturaMaxima = temperaturas[f][c];
                        indiceMaximo = f;
                    }

                    if (temperaturas[f][c] < temperaturaMínima) {
                        temperaturaMínima = temperaturas[f][c];
                        indiceMinimo = f;
                    }
                }
            }

            System.out.println("La temperatura mínima es " + temperaturaMínima + "°C en la ciudad de " + ciudades[indiceMinimo]);
            System.out.println("La temperatura máxima es " + temperaturaMaxima + "°C en la ciudad de " + ciudades[indiceMaximo]);
        }
    }