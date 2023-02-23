package POO;

public  class Libro{
    String titulo;
    String autor;

    String editorial;

    public Libro(){}//constructor vacio
    public Libro(String titulo, String autor, String editorial) { // constructor alt + insert
        // tiene parametros que tiene la clase
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String tituloAutor (){
        return "titulo " + titulo + " autor " + autor;
    }

    @Override// alt + insert --> toString
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }

}
