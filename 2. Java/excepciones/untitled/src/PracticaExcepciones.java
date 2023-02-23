public class PracticaExcepciones {
    public static class practicaExcepciones {
        private int a;
        private int b;

        public practicaExcepciones() {
            a = 0;
            b = 300;
        }

        public void calcularCociente() {
            try {
                int cociente = b/a;
                System.out.println("El cociente es: " + cociente);
            } catch (ArithmeticException e) {
                System.out.println("Se ha producido un error");
            }
        }

        public void main(String[] args) {
            practicaExcepciones pe = new practicaExcepciones.practicaExcepciones();
            pe.calcularCociente();
            System.out.println("Programa finalizado");
        }
    }
}
