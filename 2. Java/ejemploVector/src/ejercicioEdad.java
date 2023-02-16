public class ejercicioEdad {
    public static void main(String[] args) {
        int[] legajo = {1,2,3,4};
        String[] empleados = {"Gomez","Fernandez","Rodriguez","Case"};
        int[] edad = {16,38,23,45};
        //cauntos empleados hay ?
        System.out.println("Hay " + empleados.length + " empleados");
        // ¿ cual es el empleado con edad entre 30 y 40 ? ( con código )
        int empleadoIndex = 0;
        for (int i = 0; i < edad.length; i++) {
            if(edad[i] >= 30 && edad[i] <= 40) {
                empleadoIndex = i;
            }
        }
        System.out.println("El empleado es " + empleados[empleadoIndex]);
    }
}
