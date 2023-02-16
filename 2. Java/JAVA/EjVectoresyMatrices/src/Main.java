import java.util.Scanner;

public class Main {

    /* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
    Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa
    que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila, las notas
    del alumno y que en la última columna se calculen los promedios. Una vez realizado los
    cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente
    recorriendo la matriz */
    public static void main(String[] args) {
        //Primer corchete ponemos el N° de filas y en el 2° el N° de columnas
        double matriz[][] = new double[4][4];
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;

        //for para cargar
        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 3; c++) { //Recorre hasta la 3° col.(donde add notas) ya que en la 4° tiene que ir el promedio
                System.out.println("Ingrese el alumno N° " + f);
                matriz[f][c] = teclado.nextDouble(); //el prox. N° double que entre por teclado se guarda en esta var.
                suma = suma + matriz[f][c]; //va a ir sumando los datos que ingresamos en la variable "matriz"
            }
            //aquí sacamos el promedio: le indicamos que en la Fila que esté y en la columna donde necesitamos en el
            //promedio (en este caso la col. 3, realice la operación que le asignamos que sería sumar todos los valores
            // ingresados en la c/fila de las 3 col y luego las divida entre 3 ya que son la cantidad de notas que tenemos.
            matriz[f][3] = suma / 3;
            suma = 0.0; //dejamos la sumatoria en 0 para que no le acumule la nota del alumno anterior al próximo.
        }

        // for para recorrer
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno N° " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota N° " + c + " " + matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }
    }
}