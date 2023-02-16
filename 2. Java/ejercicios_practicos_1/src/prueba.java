import java.util.*;
public class prueba {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int aleatorio = (int)(Math.random()*100);
        Scanner entrada= new Scanner(System.in);
        int numero = 0;
        int intentos = 0;

        do {
            intentos++;
            System.out.println("Introduce un numero por favor");

            numero=entrada.nextInt(); // Se guarda el siguiente nuemro que se ingresa por consola

            if(aleatorio<numero) {
                System.out.println("Mas bajo");
            } else if (aleatorio>numero) {
                System.out.println("Mas alto");
            }
        } while(numero!=aleatorio);

        System.out.println("El numero es el correcto! La lograste en " + intentos + " intentos");
    }

}
