public class EjemploRecursivo {
    public static void main(String[] args) {
        System.out.println("Ver");
        calcular();
    }
 ////////////////////// NO USAR, recursividad, usar el metodo dentro del mismo metodo.
    public static void calcular(String[] args) {
        System.out.println("Calcular");
        calcular();
    }
}
