public class Main {
    public static void main(String[] args) {
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Pablo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperatura[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int tempraturaMenor = 0;
        int tempraturaMayor = 0;
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                if (tempraturaMenor > temperatura[i][j]) {
                    tempraturaMenor = temperatura[i][j];
                    posicionMenor = i;
                }
                if (tempraturaMayor < temperatura[i][j]) {
                    tempraturaMayor = temperatura[i][j];
                    posicionMayor = i;
                }
            }
        }
        System.out.println("La ciudad con menor temperatura es " + ciudades[posicionMenor] + " con " + tempraturaMenor + "º");
        System.out.println("La ciudad con mayor temperatura es " + ciudades[posicionMayor] + " con " + tempraturaMayor + "º");
    }

}