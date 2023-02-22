public class Main {
    public static void main(String[] args) {

        System.out.println("Cant. pisos biblioteca " +
                Configuracion.cantidadPisos);

        System.out.println("Maxima cantidad de dias prestamo libros " +
                Configuracion.maximoDiasPrestamos);

        Libro Libro = new Libro();
        Libro.titulo = "libro de la magia";
        Libro.autor = "nicolas";
        Libro.editorial = "morteros";

        Libro Libro1 = new Libro();
        Libro1.titulo = "Ficciones";
        Libro1.autor = "borges";

        Libro Libro3 = new Libro("estos es" ,"nicolas",  "morteros");


        Blibioteca Blibioteca = new Blibioteca();
        Blibioteca.agregarLibro(Libro);
        Blibioteca.agregarLibro(Libro1);
        Blibioteca.agregarLibro(Libro3);
        Blibioteca.listarLibros();


        System.out.println(Blibioteca.listarLibros());


    }
}