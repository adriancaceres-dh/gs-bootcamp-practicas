public class EjemploMatriz {
    public static void main(String[] args) {
        int [][] numeros = {{4,6,8},{8,-3,2},{20,-3,-5}};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " " );
            }
            System.out.println("");
        }
    }
}
