import java.util.Scanner;

public class ej1m3estructuras {
    public static void main(String[] args) {


        Scanner costoCant = new Scanner(System.in);

        System.out.print("Ingrese el costo del producto  ");

        int costoInicial = costoCant.nextInt();

        Scanner fabricaSeleccionada = new Scanner(System.in);

        System.out.print("Ingrese la fabrica seleccionada ");

        int fabricaSelecc = fabricaSeleccionada.nextInt();

        if (fabricaSelecc == 1){
            double resultado = costoInicial + ((costoInicial * 7) / 100);
            double nuevoResultado = resultado + ((resultado * 25) / 100);
            System.out.println("El costo es " + nuevoResultado);

        } else if (fabricaSelecc == 2) {
            double resultado = costoInicial + ((costoInicial * 15) / 100);
            double nuevoResultado = resultado + ((resultado * 25) / 100);
            System.out.println("El costo es " + nuevoResultado);

        } else if (fabricaSelecc == 3) {
            double resultado = costoInicial + ((costoInicial * 22) / 100);
            double nuevoResultado = resultado + ((resultado * 25) / 100);
            System.out.println("El costo es " + nuevoResultado);
        } else {
            System.out.println("Fabrica no disponible");
        }

    }
}