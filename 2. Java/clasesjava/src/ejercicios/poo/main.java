//EJERCICIO N° 3 --> crear main y su metodo
package ejercicios.poo;

public class main {
    public static void main(String[] args){
        //EJERCICIO N° 4  --> crear objetos
        persona persona = new persona();
        persona persona1 = new persona("Juan", "2345678",28);
        persona persona2 = new persona("Juan", 23, "2765438", 78.3,1.85);

        //EJERCICIO N° 6 -->

        if(persona2.esMayorDeEdad()){
            System.out.println("El paciente ingresado es mayor de edad");
        } else {
            System.out.println("El paciente ingresado es menor de edad");
        }

        if(persona2.calcularIMC() == -1){
            System.out.println("El paciente se encuentra bajo de peso");
        } else if (persona2.calcularIMC() == 0) {
            System.out.println("El paciente se encuentra con peso saludable");
        } else {
            System.out.println("El paciente se encuentra con sobrepeso");
        }

        System.out.println(persona2);


    }
}
