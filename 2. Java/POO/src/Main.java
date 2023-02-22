public class Main {
    public static void main(String[] args) {

        System.out.println("Cantidad de pisos de la biblioteca " +
                configuracion.cantidadPisos);

        System.out.println("maximo de cantidad de dias de prestamos de libros "+
                configuracion.maximoDiasPrestamos);

        Libro libro = new Libro();
        libro.titulo = "Don Segundo Sombra";
        libro.autor = "José Hernandez";

        Libro libro1 = new Libro();
        libro1.titulo = "Resistencia";
        libro1.autor = "Saramago";

        Libro libro2 = new Libro("civ o barbarie","Sarmiento","1");


        System.out.println(libro.tituloYautorDelLibro());
        /*System.out.println("libro " + libro.titulo + " del autor " + libro.autor);
        System.out.println(libro);*/

        Biblioteca biblioteca = new Biblioteca();


        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.listarLibros();
        System.out.println(biblioteca.listarLibros());
    }
}