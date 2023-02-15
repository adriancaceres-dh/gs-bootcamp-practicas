public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        /*
        String apellido = "Gomez"; // Le faltaron las comillas
        int edad = 35; // sin comillas
        boolean jueves = false; // sin comillas y nombre de la variable
        double sueldo = 45857.90 ; // modificamos string a double y pusimos el punto y coma al final
        String nombre = "Julián"; // modificamos double a string
        */

        // Ejercicio 2
        /*
        String 1nombre; // No puede empezar con un numero
        int edad; //Correcto
        double $ueldo; // No puede utilizar caracteres especiales
        String @pellido; // No puede utilizar caracteres especiales
        String direccion; //Correcto
        boolean licencia_de_conducir;  //Correcto
        double estatura de la persona; // No puede utilizar espacios
        int cantidad-de-hijos; // No puede utilizar caracteres especiales
        */

        // Ejercicio 3
    	/*
	    Scanner scanner = new Scanner(System.in);
        int total;

        System.out.println("Ingrese Cantidad de dias");

        total = scanner.nextInt();

        total = total*2;
        System.out.println("El precio de la campaña es " + total);
	*/


        // Ejercicio 4
         /*
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el monto bruto del premio: ");

        double montoBrutoPremio = scanner.nextDouble();

        double primerImpuesto = montoBrutoPremio * 0.0245;
        double segundoImpuesto = montoBrutoPremio * 0.15;
        double tercerImpuesto = montoBrutoPremio * 0.03;

        double montoNetoPremio = montoBrutoPremio - primerImpuesto - segundoImpuesto - tercerImpuesto;

        System.out.println("El monto neto del premio es de: $" + montoNetoPremio);

        DecimalFormat formatoDecimal = new DecimalFormat( "#.##");
        String montoNetoPremioDecimal = formatoDecimal.format(totalNeto);

        System.out.println("El monto neto del premio es: $" + montoNetoPremioDecimal);
       */
    }
}