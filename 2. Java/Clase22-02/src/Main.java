public class Main {
    public static void main(String[] args) {

        System.out.println(Configuracion.saludo);

        System.out.println("Cant de pisos de la biblioteca " + Configuracion.cantidadPisos);

        System.out.println("Maxima cant de dias para prestamos de libros " + Configuracion.maximoDiasPrestamos);

        Libro libro = new Libro();
        libro.titulo = "Don Segundo Sombra";
        libro.autor = "Ricardo Güiraldes";
        libro.editorial = "Eudeba";

        //System.out.println(libro.tituloyAutorDelLibro());
        //System.out.println(libro.toString());


        Libro libro1 = new Libro();
        libro1.titulo = "El poder del ahora";
        libro1.autor = "Eckart Tolle";
        libro1.editorial = "Grijalbo";

        //System.out.println(libro1.toString());

        Libro libro2 = new Libro("El senor de los anillos", "Tolkein", "A2");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.nombre = "Municipal";
        biblioteca.direccion = "Rivadavia 10";

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println(biblioteca.listarLibros());

    }
}