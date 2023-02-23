package Distribuidora;

public class Perecedero extends Producto{
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }
 // Ejercicio 3
    @Override
    public double Calcular(int CantidadDeProductos) {
        double precioFinal = CantidadDeProductos * this.getPrecio();
        if (this.diasPorCaducar == 1){
            precioFinal = precioFinal/4;
        } else if(this.diasPorCaducar == 2){
            precioFinal = precioFinal/3;
        } else if(this.diasPorCaducar == 3){
            precioFinal = precioFinal/2;
        }
        return precioFinal;
    }

    public Perecedero(String nombre, double precio) {
        super(nombre, precio);
    }
}
