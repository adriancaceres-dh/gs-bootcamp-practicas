public class PracticaExcepciones {

    public static String divison() {
        int a = 0;
        int b = 300;

        try {
            int result = b / a;

        } catch(ArithmeticException e){
            System.out.println("Se ha producido un error");
    }
        return "Programa finalizado";
}
}
