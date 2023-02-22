public class persona {
        private String nombre;
        private int edad;
        private String dni;
        private double peso;
        private double altura;

        public persona() {
            }

        public persona(String name, int year, String dni) {
                this.nombre= name;
                this.edad =edad;
                this.dni= dni;
        }
        public persona(String name, int year, String dni, double peso, double alt) {
                this.nombre= name;
                this.edad =edad;
                this.dni= dni;
                this.peso= peso;
                this.altura=altura;
        }

        public int calcularIMC() {
                double imc = peso / (Math.pow(altura, 2));

                if (imc < 20) {
                        return -1;
                } else if (imc >= 20 && imc <= 25) {
                        return 0;
                } else {
                        return 1;
                }
        }
        public boolean esMayorDeEdad() {
                return edad > 18;
        }
        @Override
        public String toString() {
                return "Persona{" +
                        "nombre='" + nombre + '\'' +
                        ", edad=" + edad +
                        ", dni='" + dni + '\'' +
                        ", peso=" + peso +
                        ", altura=" + altura +
                        '}';

        }
};




