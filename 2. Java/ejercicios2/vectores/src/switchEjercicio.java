import java.util.Scanner;

public class switchEjercicio {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1- Altas, 2-Bajas, 3-Procesos, 0-Bajas");
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (true){
            opcion = scanner.nextInt();
            if (opcion == 0) break;
            switch (opcion){
                case 1 :
                    System.out.println("Altas");
                    break;
                case  2 :
                    System.out.println("Bajas");
                    break;
                case 3:
                    System.out.println("Procesos");
                    break;
                default:
                    System.out.println("Opcion sin tareas en el sistema");
                    break;

            }


        }

    }
    }

