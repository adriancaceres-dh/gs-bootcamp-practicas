public class Main {
    public static void main(String[] args) {

        System.out.println("Cant de pisos biblioteca " + Configuracion.cantidadPisos);
        System.out.println("Maxima cantidad de dias prestamos libros " + Configuracion.maximoDiasPrestamos);

        Libro libro = new Libro();
        libro.titulo = "Don segundo sombra";
        libro.autor = "Jose Hernandez";

        Libro libro1 = new Libro();
        libro1.titulo = "Ficciones";
        libro1.autor = "Borges";



        /*System.out.println(libro.toString());*/
        /*System.out.println(libro.tituloYautorDelLibro());*/
        /*System.out.println("Libro " + libro.titulo
                         + "autor " + libro.autor
                         + "editorial " + libro.editorial);

        System.out.println(libro);*/

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);

        System.out.println(biblioteca.listarLibros());
    }
}