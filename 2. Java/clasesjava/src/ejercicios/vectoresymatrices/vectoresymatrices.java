package ejercicios.vectoresymatrices;

public class vectoresymatrices {
    public static void main(String[] args) {

        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        String[] ciudades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        String ciudadMax = "";
        String ciudadMin = "";

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++){
                if(temperaturas[i][j] > tempMax){
                    tempMax = temperaturas[i][j];
                    ciudadMax = ciudades[i];
                }
                if(temperaturas[i][j] < tempMin){
                    tempMin = temperaturas[i][j];
                    ciudadMin = ciudades[i];
                }

            }
        }
        System.out.println(ciudadMax + " registro la mayor temperatura de: " + tempMax);
        System.out.println(ciudadMin + " registro la menor temperatura de: " + tempMin);

    }
}
