public class temperaturasGlobales {
    public static void main(String[] args) {
        String ciudades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Pablo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperatura[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int tempMenor = 0;
        int tempMayor = 0;
        int menor = 0;
        int mayor= 0;

        for(int i = 0 ; i< temperatura.length; i++){
                for (int j = 0; j < temperatura[i].length; j++) {
                    if(tempMenor > temperatura[i][j]) {
                        tempMenor = temperatura[i][j];
                        menor = i;
                    } if (tempMayor < temperatura[i][j]) {
                        tempMayor = temperatura[i][j];
                        mayor = i;
                    }
                }
            }
            System.out.println("La ciudad con menor temperatura es " + ciudades[menor] + " con " + tempMenor + "º");
            System.out.println("La ciudad con mayor temperatura es " + ciudades[mayor]+ " con " + tempMayor + "º");
        }
    }