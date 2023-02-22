public class Main {
    public static void main(String[] args) {
        try {                                                       //para que no se corte el programa
            int j = 10 / 1;
            int [] numeros = {2,3,4};
            System.out.println(numeros[3]);                        //sino va dentro del try/catch el programa se corta
        } catch (ArithmeticException arithmeticException){
            System.out.println("No se pude dividir por 0");
        }catch (Exception e) {                                     //puede haber multiples catch
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cerrar todo");                    //no importa si hay error siempre viene por aca
        }
        System.out.println("El sistema termina ok");
    }
}