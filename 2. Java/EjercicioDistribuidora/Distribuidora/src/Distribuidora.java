public class Distribuidora {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("harina", 50);
        productos[1] = new NoPerecedero("Polenta", 200.2, "Paquete");
        productos[2] = new Perecedero("Manzana", 255.2, 1);

        double precioFinal = 0;
        int cantProd = 5;

        for (Producto producto: productos){
            precioFinal += producto.calcular(cantProd);
        }
        System.out.println("El precio final es " + precioFinal);
    }

}
