public class Main {
    public static void main(String[] args) {

        Cliente ejecutivo = new Ejecutivo("Martín", "44305397");

        System.out.println(ejecutivo.getNombre() + " " + ejecutivo.getDni());
        System.out.println("\n___________________");
        ejecutivo.tareasPosibles();
        System.out.println("\n___________________");
        ejecutivo.tareasNoPosibles();

    }
}