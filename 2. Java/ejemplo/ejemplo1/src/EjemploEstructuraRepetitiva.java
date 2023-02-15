public class EjemploEstructuraRepetitiva {

    public static void main(String[] args) {

        String palabra = "algo";
        System.out.println(palabra);

        for (int i = 1; i <= 7; i++) {
            System.out.println("Numero " + i );
        }

        int j = 0;
        while(j <= 7) {
            System.out.println("Numero " + j );
            j++;
        }

        int f = 1;
        do {
            System.out.println("Numero " + f );
            f++;
        } while( f <= 7 );


/*
        System.out.println("Numero 1" );
        System.out.println("Numero 2" );
        System.out.println("Numero 3" );
        System.out.println("Numero 4" );
        System.out.println("Numero 5" );
        System.out.println("Numero 6" );
        System.out.println("Numero 7" );
*/

    }
}
