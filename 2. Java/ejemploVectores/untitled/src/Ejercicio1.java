public class Ejercicio1 {
    public static void main(String[] args) {

        int[] legajo = {1,2,3,4};
        String[] empleados = {"Gomez","Fernandez","Rodriguez","Case"};
        int[] edad = {16,23,38,45};

        // ¿ cuantos empleados hay ?
        System.out.println("Hay "  + empleados.length  + " empleados" );
        // ¿ cual es el empleado con edad entre 30 y 40 ?

        for (int i = 0; i < edad.length; i++){
            if(edad[i] >= 30 && edad[i] <= 40){
                System.out.println("El empleado entre 30 y 40 años es " + empleados[i]);
            }
        }


    }
}
