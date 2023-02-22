public class Main {
    public static void main(String[] args) {

        System.out.println("Cant. pisos biblioteca" + Configuracion.cantidadPisos);

        System.out.println("Maxima cantidad de dias prestamo libros" + Configuracion.maximaDiasPrestamos);

        Libro libro = new Libro();
        libro.titulo = "Don segundo sombra";
        libro.autor = "Jose Hernandez";

        //System.out.println(libro.toString());
        //System.out.println(libro.tituloYautorDelLibro());

        Libro libro1 =new Libro();
        libro1.titulo = "Ficciones";
        libro1.autor = "Borges";

        Biblioteca biblioteca = new Biblioteca();


        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro3);
        System.out.println(biblioteca.listarLibros());

        /*System.out.println(" Libro " + libro.titulo + " autor " + libro.autor + " editorial " + libro.editorial);*/
    }
}



