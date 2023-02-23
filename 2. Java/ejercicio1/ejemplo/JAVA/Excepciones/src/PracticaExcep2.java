//Ejercicio 2
public class PracticaExcep2 {
    public static void main(String[] args) {
            String mensajeFinal = "Este es el ultimo mensaje";
            try{
                int[] numeros = new int[5];
                numeros[5] = 10;
            } catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println(mensajeFinal);
            }
    }
}
