package com.bootcamp.libros;

public class EjemploClaseObjeto {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.titulo = "Don segundo sombra";
        libro.autor = "Jose Hernandez";

        Libro libro1 = new Libro();
        libro1.titulo = "Memorias";
        libro1.autor = "Borges";

        // System.out.println("Libre " + libro.titulo + " auto" + libro.autor + " editorail" + libro.editorial);

        //System.out.println(libro.tituloYautorDelLibro());

        Libro libro2 = new Libro("El señor de los anillos","tolkein","A2");
        Libro libro3 = new Libro("civ o bar","Sarmiento","Gen");

        Biblioteca biblioteca = new Biblioteca();


        biblioteca.agregarLibro((libro));
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.listarLibros();

        System.out.println(biblioteca.listarLibros());
    }
}
