import java.util.Scanner;

public class Ejercicio3 {
    //REALIZADO ANTES DE CLASE

    /*public static void main(String[] args) {

    Cliente[] clientes = new Cliente[7];

    Cliente cliente1 = new Cliente("Festa Luciano", 1);
    clientes[0] = cliente1;
    Cliente cliente2 = new Cliente("Festa Lucas", 2);
    clientes[1] = cliente2;
    Cliente cliente3 = new Cliente("Perez Juan", 1);
    clientes[2] = cliente3;
    Cliente cliente4 = new Cliente("Federico Perez", 2);
    clientes[3] = cliente4;
    Cliente cliente5 = new Cliente("Antonutti Mariano", 1);
    clientes[4] = cliente5;
    Cliente cliente6 = new Cliente("Maria Felicitas", 1);
    clientes[5] = cliente6;
    Cliente cliente7 = new Cliente("Sofia Felicitas", 1);
    clientes[6] = cliente7;

    for(int i = 0; i < clientes.length; i++){
        double precioServicio;
        if(clientes[i].servicio == 1){
            precioServicio = 1500;
            System.out.println(i + ".- " + clientes[i].nombre + ": Costo del servicio: $" + precioServicio + ".");
        }else if(clientes[i].servicio == 2){
            precioServicio = 1500 + 700;
            System.out.println(i + ".- " + clientes[i].nombre + ": Costo del servicio: $" + precioServicio + ".");
        }
    }

    }

    public static class Cliente{
        private String nombre;
        private int servicio;

        public Cliente(String nombre, int servicio){
            this.nombre = nombre;
            this.servicio = servicio;
        }

    }*/

    //REALIZADO EN CALSE

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++){
            System.out.println("Ingresa el nombre del cliente: ");
            String nombre = scanner.next();
            System.out.println("Ingresa el numero de servicio: ");
            int servicio = scanner.nextInt();

            if(servicio < 1 || servicio > 2){
                System.out.println(" Los servicios pueden ser 1(Cámaras) o 2(Cámaras+Vigilancia)");
            }else{
                if(servicio == 1){
                    System.out.println(nombre + " debe abonar es igual: $1500");
                }else if (servicio == 2){
                    System.out.println(nombre + " debe abonar es igual: $2200");
                }
            }
        }

    }

}
