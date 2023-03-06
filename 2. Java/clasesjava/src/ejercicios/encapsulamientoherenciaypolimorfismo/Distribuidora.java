package ejercicios.encapsulamientoherenciaypolimorfismo;

public class Distribuidora {

    public static void main(String[] args){

        //creo un array de productos --> primero que tipo de datos va a recibir el array (clase prod)
        Producto [] productos = new Producto[5];

        productos[0] = new Producto("Harina", 300.00);
        productos[1] = new Producto("Huevos", 15.50);
        productos[2] = new Perecedero("Yogurt",104.50,2);
        productos[3] = new NoPerecedero("Fideos", 100.20, "Tipo2");
        productos[4] = new Perecedero("Queso",302.45,2);

        //precio total al vender 5 prod de cada uno

        double total = 0;

        for(Producto producto: productos){
            //recorremos el array y llamamos a la funcion calcular
             total = producto.calcular(5);

            System.out.println(total);
        }

    }
}
