package POO;

public class PooConJavaNotasClases {
    public static void main(String[] args){

        //  Metodos de clase
        //  para utilizar cosas globales usamos una clase y metodos estaticos,
        //  los estaticos no usan la palabra new
        System.out.println("cantidad pisos biblioteca " + configuracion.cantidadDePisos);
        System.out.println("Maxima cantidad de dias para prestamos de libros " + configuracion.maximoDiasPrestamos);

        //Ejemplo utilizando Libro.java - biblioteca.java son metodos de instancia usamos la palabra NEW
       Libro libro = new Libro();
       libro.titulo="Don segundo nombre";
       libro.autor="Jose Hernandez";
        //System.out.println("Libro " + libro.titulo + " autor " + libro.autor + " editorial " + libro.editorial);
        //System.out.println(libro.tituloAutor()); // utilizando return
        //System.out.println(libro.toString());

        Libro libro1 =new Libro();
        libro1.titulo="Memorias";
        libro1.autor="Borges";
        //System.out.println(libro1.tituloAutor);


        //utilizando constructor

        Libro libro2 =new Libro ("el señor de los anillos", "tolkein", "A2");

        //class biblioteca
        Biblioteca biblioteca =new Biblioteca();
        biblioteca.nombre="Municipal";
        biblioteca.direccion="arenales 506";
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.listarLibros();
        System.out.println(biblioteca.listarLibros());


    }
}
