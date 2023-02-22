public class ClaseVivo {

    public static void main(String[] args) {

        System.out.println("Cantidad de pisos: " + Config.cantidadPisos);
        System.out.println("Cantidad de días máximos para prestar un libro: " + Config.diasPrestamoMaximo);

        Libro libro = new Libro();
        libro.titulo = "Antes que sea tarde";
        libro.autor = "Pepito Lopez";
        libro.editorial = "Sol";

        Libro libro1 = new Libro();
        libro1.titulo = "La vida es bella";
        libro1.autor = "Juancito Perez";
        libro1.editorial = "Planeta";

        //Usando constructores
        Libro libro3 = new Libro("Buscando a Pepito","Juanito Cualqui");
        Libro libro2 = new Libro("Sangre de campeones","Colon","Mundo");

        /*System.out.println("El libro se llama: " + libro.titulo
                            + " cuyo autor es: " + libro.autor
                            + "Editorial: " + libro.editorial);

        Para no escribir tanto codigo en el main, los metodos se escriben en la clase y se instancian en el main
        */

        //System.out.println(libro.tituloAutor());
        //System.out.println(libro.toString()); //Sin el toString() en la clase, mostraria solo la posicion en memoria y no la info del objeto.



        //Creando una clase biblioteca.

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nombre = "Municipal";
        biblioteca.direccion = "Bv 9 de Julio 1144";
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro2);

        System.out.println(biblioteca.listarLibros());



    }

}
