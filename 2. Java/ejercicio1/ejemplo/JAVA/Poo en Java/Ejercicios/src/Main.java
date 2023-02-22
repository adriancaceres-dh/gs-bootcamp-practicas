import org.w3c.dom.ls.LSOutput;

//Ejercicio 3
public class Main {
    public static void main(String[] args) {
        //Ejercicio 4

        Persona persona = new Persona();
        Persona persona1 = new Persona("Jesica", 32, "35222425");
        Persona persona2 = new Persona("Enzo", 6, "56574276", 30, 1.20);

        //Ejercicio 6

        if(persona1.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        if(persona2.calcularIMC() == 1){
            System.out.println("Bajo peso");
        } else if (persona2.calcularIMC() == 0){
            System.out.println("Peso saludable");
        } else {
            System.out.println("Sobrepeso");
        }
        System.out.println(persona2);
    }
}