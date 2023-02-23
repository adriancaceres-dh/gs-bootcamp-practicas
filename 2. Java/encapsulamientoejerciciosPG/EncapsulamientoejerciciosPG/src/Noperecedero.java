public class Noperecedero extends Producto {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Noperecedero(String tipo) {
        this.tipo = tipo;
    }

    public Noperecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        return super.calcular(cantidadDeProductos);
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}


