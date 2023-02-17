public class Ejemplo_Matriz {
    public static void main(String[] args) {

        int[][] numeros = {{4,6,8},{8,-3,2},{20,-3,-5}};

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

        // Ejercicio práctica

        int[] legajo = {1,2,3,4};
        String[] empleados = {"Gomez","Fernandez","Rodriguez","Case"};
        int[] edad = {16,38,23,45};

        // ¿ cual es el empleado con edad entre 30 y 40 ? ( con código )

        for (int i = 0; i < edad.length; i++){
            if(edad[i] >= 30 && edad[i] <= 40){
                System.out.println("El empleado que tiene entre 30 y 40 años es " + empleados[i] + ", con legajo " + legajo[i]);
            }
        }




    }
}
