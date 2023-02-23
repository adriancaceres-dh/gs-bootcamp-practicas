
public class Distribuidora {
    public static void main(String[] args) {
        Productos[] productos = new Productos[3];

        productos[0] = new Productos("Manteca", 200);
        productos[1] = new Perecedero("Atún", 200, 1);
        productos[2] = new NoPerecedero("Queso", 200, "lacteo");
      /*  productos[3] = new Productos("Arroz", 200);
        productos[4] = new Productos("Harina", 200);
        productos[5] = new Productos("Queso", 100);*/

        double totalProductos=0;

        for (Productos producto: productos){
            totalProductos = totalProductos + producto.calcular(5);


        }
        System.out.println(totalProductos);

        
    }
}
