package EjercicioObjetos;

public class Main {
    public static void main(String[] args) {

        // Objetos para cada constructor
        Persona persona = new Persona();
        Persona persona1 = new Persona("Stefano", 29, "21313143");
        Persona persona2 = new Persona("Francesco", 5, "99877213", 17, 1.10);

        // Imprimimos el nombre de la persona
        System.out.println("El nombre de la persona es: " + persona2.getNombre());

        // Calculamos el IMC de la persona
        int imc = persona2.calcularIMC();

        if (imc == -1) {
            System.out.println("Se encuentra con bajo peso");
        } else if (imc == 0) {
            System.out.println("Se encuentra con un peso correcto");
        } else {
            System.out.println("Se encuentra con sobrepeso");
        }

        // Averiguamos si es mayor o menor de edad
        boolean esMayor = persona2.esMayorDeEdad();

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}



