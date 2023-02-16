import java.util.Scanner;

public class Ej_VecMatr_PlayG {
    public static void main(String[] args) {

        int[][] temperaturas = {{-2,33}, {-3,32}, {-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};
        String[] ciudades = {"Londres", "Madrid", "New York", "Buenos Aires", "Asunción", "Sao Paulo", "Lima",
                             "Santiago de Chile", "Lisboa", "Tokio"};
        int mayorTemp = 0;
        int menorTemp = 0;
        String mayorCiudad = " ";
        String menorCiudad = " ";

       for (int i= 0; i <temperaturas.length; i++){
            for (int j = 0; j <temperaturas[i].length; j++){
                if (temperaturas[i][j] >mayorTemp ){
                    mayorTemp = temperaturas[i][j];
                    mayorCiudad = ciudades[i];
                }
                if (temperaturas[i][j] <menorTemp ){
                    menorTemp = temperaturas[i][j];
                    menorCiudad = ciudades[i];
                }
            }
        }
        System.out.println(mayorCiudad + " registro la mayor temperatura de: " + mayorTemp);
        System.out.println(menorCiudad + " registro la menor temperatura de: " + menorTemp);
    }
}

