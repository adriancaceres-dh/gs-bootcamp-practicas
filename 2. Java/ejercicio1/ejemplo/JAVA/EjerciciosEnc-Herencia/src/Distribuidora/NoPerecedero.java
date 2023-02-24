//Ejercicio 4

package Distribuidora;

public class NoPerecedero extends Producto {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public double calcular(int CantidadDeProductos) {
        return super.calcular(CantidadDeProductos);
    }

    public NoPerecedero(String nombre, double precio) {
        super(nombre, precio);
    }
}
