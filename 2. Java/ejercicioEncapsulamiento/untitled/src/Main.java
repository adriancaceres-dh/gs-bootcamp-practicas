public class Main {
    public static void main(String[] args) {

        System.out.println(Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setDni("452345");

        System.out.println(persona);

    }
}