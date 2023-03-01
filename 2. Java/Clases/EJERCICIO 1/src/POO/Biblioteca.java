package POO;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    String direccion;

    List<Libro>libros=new ArrayList<>();
    public void agregarLibro(Libro Libro){ //parametro en este caso de un objeto = Libro libro
        libros.add(Libro);
    }
    public String listarLibros(){ // cambie el void por String para return
        String listaLibros = "";  //no imprime por pantalla, devuelve un string
        for (Libro libro:libros) { // se puede llevar a cualquier lado
            //System.out.println(libro.toString());
            listaLibros= listaLibros + libro.toString();
        }
        return listaLibros;
    }

}
