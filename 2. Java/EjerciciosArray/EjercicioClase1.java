import java.util.Arrays;

public class EjercicioClase1 {
    public static void main(String[] args) {
        int[]legajo={1,2,3,4};
        String[]empleados={"Gomez", "Fernandez","Rogri","Case"};
        int[] edad={16,36,23,45};

        //cuantos empleados hay?
        System.out.println("hay "+ empleados.length+" empleados");
        //empleados entre 30 y 40 anios

        for(int i=0; i<edad.length; i++){
            if (edad[i]>30 && edad[i]<40) {
                System.out.println("El empleado es: "+empleados[i]);
            }
        }
    }
}
