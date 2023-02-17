package teoria;

public class teoriac2 {
    public static void main(String[] args) {
        int [] numeros = {3,4,5,-2,-5}; //declaramos un array ya con valores
        //System.out.println(numeros[4]); imprime en consola la posición 4

        //System.out.println(numeros[6]) si pedimos una posicion que no existe en el array la consola arroja error

        // imprime por consola cada elemento del array
        for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }

        //Ambas formas de hacer un arrray con cualquier tipo de dato
        String[] nombres = {"Juan", "Maria", "Tomas"};
        String[] nombre = new String[3];
        nombre[0]="Juan";
        nombre[1]="Maria";
        nombre[2]="Tomas";

        //contador de positivos y negavitos
        int[] numero = {1, 2, 4, 5, -5, -3};
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] >= 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        //System.out.println("Hay " + positivos + " numeros positivos y hay " + negativos + " numeros negativos");

        // array bidimensional
        int [][] matriz = {{4,5,6},{1,2,3},{9,8,7}};

        for(int i=0; i< matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++) {
                //System.out.println(matriz[i][j] + " ");
            }
        }

        //cual es el empleado con edad entre 30 y 40

        String [] empleados = {"juan", "carlos", "pedro", "mateo"};
        int [] edades = {16,38,23,45};

        for (int i = 0; i < edades.length; i++){
            if(edades[i] >= 30 && edades[i] <= 40){
                //System.out.println("El empleado entre 30 y 40 años es  " + empleados[i]);
            }
        }




    }
}


