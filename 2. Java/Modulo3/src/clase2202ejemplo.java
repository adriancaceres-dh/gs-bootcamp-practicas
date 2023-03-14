import crearClase.Libro;

public class clase2202ejemplo {
    public static String main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "Don Segundo Sombra";
        libro.autor = "jose Hernandez";

        System.out.println( "Libro" +  libro.titulo + " su autor es " + libro.autor);

        public String tituloYautorDelLibro() {
            return "Titulo " + libro.titulo + " autor " + libro.autor;};

            @Override
            public String toString () {
                return "Libro{" +
                        "titulo='" + libro.titulo + '\'' +
                        ", autor='" + libro.autor + '\'' +
                             '}';

            Libro libro = new Libro();
            libro.titulo = "Don segundo sombra";
            libro.autor = "Jose Hernadez";

            //System.out.println(libro.toString());
            //System.out.println(libro.tituloYautorDelLibro());

            Libro libro1 = new Libro();
            libro1.titulo = "Ficciones";
            libro1.autor = "Borges";

            //System.out.println(libro1.tituloYautorDelLibro());

            Biblioteca biblioteca = new Biblioteca();

            biblioteca.agregarLibro(libro);
            biblioteca.agregarLibro(libro1);

            biblioteca.listarLibros();
            }
        }}


