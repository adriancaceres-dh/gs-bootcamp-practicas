public class Main {
    public static void main(String[] args) {




        Persona Persona1 = new Persona( );
        Persona persona1 = new Persona("Agustina", 22, "4422353");
        Persona persona2 = new Persona("Marian", 30, "23422542", 80, 1.80);

        int imc = persona2.calcularIMC();

        if (imc == -1) {
            System.out.println("Se encuentra con bajo peso");
        } else if (imc == 0) {
            System.out.println("Tiene un peso saludable");
        } else if (imc == 1) {
            System.out.println("Se encuentra con sobrepeso");
        }

        boolean esMayor = persona2.esMayorDeEdad();

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Los datos de la persona son: " + persona2.toString());
    }


    }

