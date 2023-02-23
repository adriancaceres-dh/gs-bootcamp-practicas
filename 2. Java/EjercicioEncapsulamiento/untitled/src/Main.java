public class Main {
    public static void main(String[] args) {
        System.out.println("cantidad de corazones " +  Persona.cantidadCorazones);

        Persona persona = new Persona();
        persona.setNombre("nicolas");
        persona.setDni("34433343");

        System.out.println(persona);
    }
}