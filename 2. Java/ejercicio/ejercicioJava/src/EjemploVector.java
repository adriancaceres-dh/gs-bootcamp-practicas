public class EjemploVector {

    public static void main(String[] args) {
        int[] numeros = {3,4,5,8,6};

        System.out.println(numeros[3]);
        for (int indice = 2; indice <numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }

        String[] nombres = new String[3];
        nombres[0] ="Juan";
        nombres[1] ="Maria";
        nombres[2] ="Tomas";
        System.out.println(nombres[2]);



        int[] [] numeros2= {{4,6,8},{8,-3,2},{20,-3,-5}};

            for(int i = 0; i < numeros2.length; i++) {
                for ( int j= 0; j < numeros2[i].length; j++) {
                    System.out.print(numeros2[i][j] + " ");
                }
                System.out.println("");
            }



        int[] legajo = {1,2,3,4};
        String[] empleados = {"Gomez","Fernandez","Rodriguez","Case"};
        int[] edad = {16,38,23,45};

        for (int i = 0; i < edad.length; i++){
            if(edad[i] >= 30 && edad[i] <= 40){
                System.out.println("El empleado entre 30 y 40 años es " + empleados[i]);
            }
        }


    }
}
