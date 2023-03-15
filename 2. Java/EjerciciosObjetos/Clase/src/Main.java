public class Main {
    public static void main(String[] args) {

        //Primero se crean las clases, siempre con mayuscula. Y dsp se instancia el objeto para que se guarde en la memoria y poder utilizarla.
        //Una buena practica es que cada clase tenga su propio archivo, como Libro.
        class Salvador {
            String nombre;
            int edad;
        }
        Salvador salvador = new Salvador(); //asi se llama a la clase, le damos indentidad y llamamos al Constructor con new.

//        Libro libro = new Libro();
//        libro.titulo = "Harry Poter";
//        libro.autor = "Carlos";
//
//        Libro libro1 = new Libro();
//        libro1.titulo = "Sandunga";
//        libro1.autor = "Raul";

        Libro libro2 = new Libro("Principito", "Frances");


        //        System.out.println("Libro " + libro.titulo + " de " + libro.autor);
//
//        System.out.println(libro.tituloYautorDelLibro());
//
//        System.out.println(libro.toString()); //muestra los datos como objeto.


        /////////////////////////////////////////////////////

        Biblioteca biblioteca = new Biblioteca();

//        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);

        System.out.println(biblioteca.listarLibros());

        //los metodos estaticos, que no se cambian, no llevan la palabra new como los otros.
        System.out.println("Cant. de pisos biblioteca: " + Configuracion.cantidadPisos);
        System.out.println("Maximo dias para prestar libro: " + Configuracion.maximoDiasPrestamos);


    }
}
