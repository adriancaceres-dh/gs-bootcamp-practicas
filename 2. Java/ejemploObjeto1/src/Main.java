public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro();
        libro.titulo = "Don segundo sombra";
        libro.autor = "Jose Hernandez";

//        System.out.println(libro.toString());
//        System.out.println(libro.tituloYautorDelLibro());

//        System.out.println("Libro " + libro.titulo + " autor " + libro.autor + " editorial " + libro.editorial);

        Libro libro1 = new Libro();
        libro1.titulo = "Ficciones";
        libro1.autor = "Broges";

        Libro libro3 = new Libro("El señor de los anillos", "Tolkien", "editorial");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nombre = "Municipal";
        biblioteca.direccion = "Calle falsa 123";
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro3);
        biblioteca.listarLibros();
//        //System.out.printf("");

        System.out.println(biblioteca.listarLibros());

    }
}