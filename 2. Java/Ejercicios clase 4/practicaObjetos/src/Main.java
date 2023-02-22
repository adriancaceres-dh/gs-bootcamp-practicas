public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Persona("Ezequiel", 57, "22577255");
        Persona persona2 = new Persona("Javier", 49, "25678876", 89, 1.70);

        System.out.println(persona.toString());
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        int imc = persona2.calcularIMC();
        if (imc == -1) {
            System.out.println(" Se encuentra con bajo peso ");
        } else if (imc == 0) {
            System.out.println(" Se encuentra con un peso correcto ");
        } else {
            System.out.println(" Se encuentra con sobrepeso ");
        }

        boolean esMayor = persona.esMayorDeEdad();

        System.out.println(persona2.getNombre() + " Tiene un IMC " + imc);

        if (esMayor) {
            System.out.println("Es menor de edad ");
        } else {
            System.out.println("Es mayor de edad");
        }
    }
}