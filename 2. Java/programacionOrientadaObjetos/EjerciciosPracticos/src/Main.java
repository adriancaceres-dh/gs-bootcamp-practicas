public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Persona persona = new Persona();
        Persona persona1 = new Persona("Juan", "41905164", 23);
        Persona persona2 = new Persona("Francisco", "37068569", 43, 63, 1.80);

        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        if (persona2.calcularIMC() == -1) {
            System.out.println("Bajo de peso");
        } else if (persona2.calcularIMC() == 0) {
            System.out.println("Peso saludable");
        } else {
            System.out.println("Sobrepeso");
        }
        System.out.println(persona2);
    }
}

