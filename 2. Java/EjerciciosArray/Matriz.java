public class Matriz {
    public static void main(String[] args) {
        //forma de hacer una matriz
        int[][] numeros={{4,6,8},{8,-3,0},{20,6,7}};

        //para recorrer matrices
        for (int i=0;i<numeros.length;i++){
           // System.out.println(numeros[i].length);
            for (int j=0;j<numeros[i].length;j++){
             System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
