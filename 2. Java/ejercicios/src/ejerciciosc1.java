//EJERCICIO N° 1
/*public class ejerciciosc1 {
    String apellido = "Gomez"; //faltaban comillas
    int edad = 35; //sobraban comillas
    boolean variable = false; // faltaba nombre de la variable y eliminar comillas de false
    double sueldo = 45857.90;// estaba mal el tipo de dato
    String nombre = "Julián";
}*/

//EJERCICIO N°2
/*public class ejerciciosc1 {
    String nombre; // sin numeros
    int edad;
    double sueldo; // sin caracteres especiales
    String apellido; // sin caracteres especiales
    String direccion;
    boolean licencia_de_conducir;
    double estaturaDeLaPersona; // sin espacios
    int cantidadDeHijos;// sin -, solo el _ esta permitido
} */

//EJERCICIO N° 3

/*import java.util.Scanner; // importa el paquete Scanner, que permite leer los tipos de datos
public class ejerciciosc1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //  para poder usar Scanner bajo el nombre de la variable que elijamos
        System.out.println("Ingrese la cantidad de dias"); // pide por consola que se aclaren la cantidad de dias
        double cantidadDias = sc.nextDouble(); // lee el valor int que ingresa el usuario y lo almacena en la variable
        double precioFinal =  cantidadDias * 2; // multiplica por $2 la variable almacenada para calcular el precio

        System.out.println(precioFinal); //muestra en consola el resultado final5
    }
} */

//EJERCICIO N° 4

/*import java.util.Scanner;
public class ejerciciosc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el monto de su premio");
        double valorPremio = sc.nextDouble();

        double impuesto1 = valorPremio * 0.0245;
        double impuesto2 = valorPremio * 0.15;
        double impuesto3 = valorPremio *0.03;

        double premioFinal = valorPremio - impuesto1 - impuesto2 - impuesto3;

        System.out.println(premioFinal);
    }
} */



