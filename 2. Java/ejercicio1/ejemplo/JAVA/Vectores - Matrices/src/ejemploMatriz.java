public class ejemploMatriz {
    public static void main(String[] args) {
        int[][] numeros = {{4, 6, 8}, {8, -3, -1}, {30, 56, 41}};
        for (int i=0; i< numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}