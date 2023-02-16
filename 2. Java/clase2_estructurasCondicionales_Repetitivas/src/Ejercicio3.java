public class Ejercicio3 {
    public static void main(String[] args) {

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

    }

}
