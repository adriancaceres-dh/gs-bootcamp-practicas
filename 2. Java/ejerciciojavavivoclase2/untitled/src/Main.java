public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Persona("Juan","243545",28);
        Persona persona2 = new Persona("Pedro","345324",23,75.0,1.85);

        if(persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        if(persona2.calcularIMC() == -1) {
            System.out.println("Bajo de peso");
        } else if (persona2.calcularIMC() == 0) {
            System.out.println("Peso saludable");
        } else {
            System.out.println("Sobre peso");
        }

        System.out.println(persona2);

    }
}