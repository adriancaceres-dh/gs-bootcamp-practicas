package ExcepcionesyClasesUtilitarias.EjerciciosPrácticos;


    public class Calculos {

        public static int obtenerMayor(int num1, int num2) {
            return Math.max(num1, num2);
        }

        public static int obtenerMenor(int num1, int num2) {
            return Math.min(num1, num2);
        }

        public static double calcularPotencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }

        public static double calcularCoseno(double angulo) {
            return Math.cos(angulo);
        }

        public static double calcularRaizCuadrada(double numero) {
            return Math.sqrt(numero);
        }

        public static int generarNumeroAleatorio() {
            return (int) (Math.random() * 1000);
        }
    }
