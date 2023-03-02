public class Main {
    public static void main(String[] args) {



        Producto producto = new Producto("Pan", 20.5);
        System.out.println(producto);
        System.out.println(producto.calcular(3));
        System.out.println("--------------------------------------------");
        Perecedero perecedero = new Perecedero("Leche", 15.8, 3);
//        System.out.println(perecedero.getNombre());
        System.out.println(perecedero);
        System.out.println(perecedero.calcular(3));
        System.out.println("--------------------------------------------");
        NoPerecedero noPerecedero = new NoPerecedero("Arroz", 7.9, "Grano fino") ;
//        noPerecedero.setTipo("Grano fino");
        System.out.println(noPerecedero);
        System.out.println(noPerecedero.calcular(4));
    }
}
