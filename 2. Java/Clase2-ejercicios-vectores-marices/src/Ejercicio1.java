public class Ejercicio1 {
    public static void main(String[] args) {

        String ciudades [] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int temperaturas [][] = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{6,43},{0,39},{-7,26},{-1,31},{-10,35}};

        int temperaturaMax = 0;
        int temperaturaMin = 0;
        int paisTemperaturaMax = 0;
        int paisTemperaturaMin = 0;

        for (int f=0; f<=9; f++) {
            for (int c=0; c<=1; c++) {
                if(temperaturaMax<temperaturas[f][c]){
                    temperaturaMax = temperaturas[f][c];
                    paisTemperaturaMax = f;
                }
                if(temperaturaMin>temperaturas[f][c]){
                    temperaturaMin = temperaturas[f][c];
                    paisTemperaturaMin = f;
                }
            }
        }
        System.out.println("La temperatura máxima es de "+ temperaturaMax +"°"+ " en la ciudad de " + ciudades[paisTemperaturaMax]);
        System.out.println("La temperatura minima es de "+ temperaturaMin +"°"+ " en la ciudad de " + ciudades[paisTemperaturaMin]);

    }

}
