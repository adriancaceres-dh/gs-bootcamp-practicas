public class Main {
    public static void main(String[] args) {

        System.out.println("Cant. pisos biblioteca " +
                Configuracion.cantidadPisos);

        System.out.println("Maxima cantidad de dias prestamo libros " +
                Configuracion.maximoDiasPrestamos);

        Libro libro = new Libro();
        libro.titulo = "Don segundo sombra";
        libro.autor = "Jose Hernadez";

        //System.out.println(libro.toString());
        //System.out.println(libro.tituloYautorDelLibro());

        Libro libro1 = new Libro();
        libro1.titulo = "Ficciones";
        libro1.autor = "Borges";

        Libro libro3 = new Libro("Civ o Bar","Sarmiento","Gen");

        //System.out.println(libro1.tituloYautorDelLibro());

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro3);
        System.out.println(biblioteca.listarLibros());

        /*
        System.out.println("Libro " + libro.titulo
                        + " autor " +  libro.autor
                        +  " editorial " + libro.editorial );

        System.out.println(libro);
        */
    }
}