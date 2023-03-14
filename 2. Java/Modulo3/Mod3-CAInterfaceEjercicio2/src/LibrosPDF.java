public class LibrosPDF implements DocumentoImprimible {
 private int cantidadDePaginas;

 private String autor;

 private String titulo;

 private String genero;

 public LibrosPDF(){};

 @Override
 public String toString() {
  return "LibrosPDF{" +
          "cantidadDePaginas=" + cantidadDePaginas +
          ", autor='" + autor + '\'' +
          ", titulo='" + titulo + '\'' +
          ", genero='" + genero + '\'' +
          '}';
 }

 @Override
 public void imprimir() {
  System.out.println("Se ha impreso el Libro PDF");
 }
}

