public class EjemploSwitch {

    public static void main(String[] args) {

        int nota = 10;  // 4 aprobado, 3 a final, 2 recursa, 1 libre

        switch (nota) {
            case 4:
                System.out.println("Aprobado");
                break;
            case 3:
                System.out.println("A final");
                break;
            case 2:
                System.out.println("Recursa");
                break;
            case 1:
                System.out.println("Libre");
                break;
            default:
                System.out.println("Numero no asignado");
                break;
        }


    }

}
