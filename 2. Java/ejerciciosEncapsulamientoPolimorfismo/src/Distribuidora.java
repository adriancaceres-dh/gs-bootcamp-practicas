public class Distribuidora {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("Alfajor", 100);
        productos[1] = new Producto("Caramelo", 10);
        productos[2] = new Producto("Chupetin", 40);
        productos[3] = new Producto("Gaseosa", 400);
        productos[4] = new Producto("Turron", 200);

        for(Producto producto : productos ){
            double precioTotal = producto.Calcular(5);
            System.out.println("El total vendido por "+ producto.getNombre() + " es $" + precioTotal);
        }
    }
}
