import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        //Actividad 1:

        /*
        String apellido = "Gomez";
        int edad = 35;
        boolean variable = false;
        double sueldo = 45857.90;
        String nombre = "Julián";

        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(variable);
        System.out.println(sueldo);
        System.out.println(nombre);
        */

        //Actividad 2:


        String nombre;
        int edad;
        double sueldo;
        String apellido;
        String direccion;
        boolean licencia_de_conducir;
        double estatura_de_la_persona;
        int cantidad_de_hijos;


        //Actividad 3:

        System.out.println("El costo de la campaña es: $" + precioCampaña(10));
        System.out.println("El costo de la campaña es: $" + precioCampaña(30));

        //Actividad 4:

        System.out.println("El premio final es de: $" + premioNeto(5000000));
        System.out.println("El premio final es de: $" + premioNeto(23563899));

    }
    public static int precioCampaña(int dias){
        int precioFijo = 2;
        int precioTotal = precioFijo * dias;
        return precioTotal;
    }

    public static String premioNeto (double premioBruto){
        double primerImpuesto = premioBruto * 0.0245;
        double segundoImpuesto = premioBruto * 0.15;
        double tercerImpuesto = premioBruto * 0.03;

        double premioFinal = premioBruto - primerImpuesto - segundoImpuesto - tercerImpuesto;

        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        String numero = formatoDecimal.format(premioFinal);
        return numero;
    }
}
