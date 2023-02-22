public class ejemploRecursivo {
    public static void main(String[] args) {
        System.out.println("Ver");
        calcular();
    }
    //no llamar un metodo dentro de si mismo
    public static void calcular(){
        System.out.println("Calcular");
        calcular();
    }
}
