public class EjemploRecursivo {
    public static void main(String[] args) {
        System.out.println("Ver");
        calcular();
    }

    // Tratar de no usar
    public static void calcular() {
        System.out.println("Calcular");
        calcular();
    }
}
