public class Main {
    public static void main(String[] args) {

        Cliente ejecutivo1 = new Ejecutivos("Fernando","2222222");
        System.out.println("---------------------------------------");
        System.out.println(ejecutivo1.getNombre() + " es Ejecutivo y puede: ");
        ejecutivo1.tareasPosibles();
        System.out.println("---------------------------------------");
        System.out.println("Pero no puede: ");
        ejecutivo1.tareasNoPermitidas();
    }
}