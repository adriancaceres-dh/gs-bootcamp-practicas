package ejercicios.inicial;
import java.util.Scanner; // importa el paquete Scanner, que permite leer los tipos de datos
public class ejercicio3 {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in); //  para poder usar Scanner bajo el nombre de la variable que elijamos
            System.out.println("Ingrese la cantidad de dias"); // pide por consola que se aclaren la cantidad de dias
            double cantidadDias = sc.nextDouble(); // lee el valor int que ingresa el usuario y lo almacena en la variable
            double precioFinal =  cantidadDias * 2; // multiplica por $2 la variable almacenada para calcular el precio

            System.out.println(precioFinal); //muestra en consola el resultado final5
        }
}
