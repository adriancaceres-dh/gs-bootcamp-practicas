public class Distribuidora {
    public static void main(String []args){
        Producto[] productos = new Producto[3];
        productos[0] =new Producto("harina",20.02);
        productos[1]= new Producto("polenta",10.50);

        double precioFinal = 0;
        int cantProd = 5;

        for (Producto producto: productos){
            precioFinal += producto.calcular(cantProd);
        }
        System.out.println("El precio final es " + precioFinal);
    }
}
