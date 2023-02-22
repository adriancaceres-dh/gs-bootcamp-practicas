
    public class Libro {
        String titulo;
        String autor;

        String editorial;

        public Libro(){}

        public Libro(String titulo) {
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
        }

        @Override
        public String toString() {               //metodo
            return "Libro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", editorial='" + editorial + '\'' +
                    '}';
        }
    }

