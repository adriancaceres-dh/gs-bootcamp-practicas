public class personaMain {

    public static void main(String[] args) {

        Persona persona = new Persona("Franco", 29, "37575676");
        Persona persona1 = new Persona("Pamela", 30, "37330667");
        Persona persona2 = new Persona("Valentina", 26, "94576856");

        Persona persona3 = new Persona();
        persona3.nombre = "Pamela";
        persona3.edad = 30;
        persona3.peso = 72;
        persona3.altura = 164;

        Persona persona4 = new Persona();
        persona4.nombre = "Franco";
        persona4.edad = 29;
        persona4.peso = 67;
        persona4.altura = 164;

        Persona persona5 = new Persona();
        persona5.nombre = "Valentina";
        persona5.edad = 26;
        persona5.peso = 72;
        persona5.altura = 164;


        int imc = persona3.calcularIMC();
        boolean mayorDeEdad = persona3.esMayorDeEdad();

        System.out.println("La persona es " + persona3.nombre + ", y su imc es: " + imc );
        System.out.println("Es mayor de edad? " + mayorDeEdad);

    }
}
