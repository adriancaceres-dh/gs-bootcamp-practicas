import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner fabrica = new Scanner(System.in);
        System.out.println("Ingresá el número de fábrica: ");
        int numeroFabrica = fabrica.nextInt();

        if(numeroFabrica < 1 || numeroFabrica > 3){
            System.out.println("No se encuentra el número de fábrica ingresado.");

        }else{
            Scanner precio = new Scanner(System.in);
            System.out.println("Ingresá el valor de la mercadería en $: ");
            double precioCostoMercaderia = precio.nextDouble();

            if(numeroFabrica == 1){
                double costoMercaderiaConEnvio = precioCostoMercaderia * 0.07 + precioCostoMercaderia;
                double precioDeVenta = costoMercaderiaConEnvio * 0.25 + costoMercaderiaConEnvio;
                System.out.println("El precio de venta del producto es de: $" + precioDeVenta);
            }else if(numeroFabrica == 2){
                double costoMercaderiaConEnvio = precioCostoMercaderia * 0.15 + precioCostoMercaderia;
                double precioDeVenta = costoMercaderiaConEnvio * 0.25 + costoMercaderiaConEnvio;
                System.out.println("El precio de venta del producto es de: $" + precioDeVenta);
            }else if(numeroFabrica == 3){
                double costoMercaderiaConEnvio = precioCostoMercaderia * 0.22 + precioCostoMercaderia;
                double precioDeVenta = costoMercaderiaConEnvio * 0.25 + costoMercaderiaConEnvio;
                System.out.println("El precio de venta del producto es de: $" + precioDeVenta);
            }
        }
    }
}
