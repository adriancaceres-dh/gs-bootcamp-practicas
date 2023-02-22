
public class Main {
    public static void main(String... args) {


     System.out.println("Cantidad de pisos de la biblioteca " + Configuracion.cantidadDePisos);
     System.out.println("Cantidad maxima de dias de prestamo de libros " + Configuracion.maximoDiasPrestamos);


     Libro libro = new Libro();
        libro.editorial = "Universo";
        libro.titulo = "Don segundo sombra";
        libro.autor = "José Hernandez";

        Libro libro1 = new Libro();
        libro1.titulo = "Ficciones";
        libro.autor = "Borges";

        Libro libro2 = new Libro ("Civilizacion o barbarie", "Sarmiento", "Gen");

        Bibloteca biblioteca = new Bibloteca();

        biblioteca.nombre = "Municipal";
        biblioteca.direccion = "Rafaela, Santa fe";
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        System.out.println(biblioteca.listarLibros());
     System.out.println(biblioteca);


    }
}
