import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++){
            System.out.println("Cliente N°" + (i+1) + ". Elija entre servicio 1 o 2");
            int servicio = scanner.nextInt();
            if(servicio == 1){
                System.out.println("El cliente N°" + (i+1) + " debe abonar $1500");
            }else if(servicio == 2){
                System.out.println("El cliente N°" + (i+1) + " debe abonar $2200");
            }else{
                System.out.println("No poseemos ese numero de servicio");
            }
        }
    }
}