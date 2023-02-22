package teoria.teoriac4;

public class Main {
    public  static  void main(String[] args){

        Libro libro = new Libro();
        libro.titulo = "Don Segundo Sombra";
        libro.autor = "Jose Hernandez";

        //System.out.println(libro.toString());
       // System.out.println(libro.tituloYAutorDelLibro());

        Libro libro1 = new Libro();
        libro1.titulo = "El Aleph";
        libro1.titulo = "Jorge Borges";

        /*
        System.out.println("Libro " + libro.titulo
                            + "autor" + libro.autor
                            +  "editorial" + libro.editorial); */

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);

        biblioteca.listarLibros();

    }

}
