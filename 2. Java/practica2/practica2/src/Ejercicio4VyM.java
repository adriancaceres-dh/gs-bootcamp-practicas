public class Ejercicio4VyM {
    public static void main(String[] args) {
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
    };
        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int temperaturaMenor = 0;
        int temperaturaMayor = 0;
        int menorTemp = 0;
        int mayorTemp = 0;

        for(int i = 0; i < temperaturas.length; i++){
            for (int j = 0; j < temperaturas[i].length; j++)
            {
                if (temperaturaMayor < temperaturas[i][j]) {
                    temperaturaMayor = temperaturas[i][j];
                    menorTemp= i;

                }
                if (temperaturas[i][j] < menorTemp) {
                    menorTemp = temperaturas[i][j];
                    mayorTemp= i;
                }
                System.out.println("la temperatura mayor fue de :"+temperaturaMayor+ " en la ciudad de: " +ciudades[mayorTemp]);
                System.out.println("la temperatura menor fue de :"+temperaturaMenor+ " en la ciudad de: " + ciudades[menorTemp]);

            }
        }
    }





