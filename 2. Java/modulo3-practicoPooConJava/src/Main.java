import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   persona persona1= new persona();
   persona persona2= new persona("Ana",32,"4546846346");
   persona persona3= new persona("Juan",26,"5236689",75,1.82);
    //private static Object persona;
        int imc = persona3.calcularIMC();

        if (imc == -1) {
            System.out.println("Se encuentra con bajo peso");
        } else if (imc == 0) {
            System.out.println("Tiene un peso saludable");
        } else if (imc == 1) {
            System.out.println("Se encuentra con sobrepeso");
        }

        boolean esMayor = persona3.esMayorDeEdad();

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println(persona3.toString());


}}
