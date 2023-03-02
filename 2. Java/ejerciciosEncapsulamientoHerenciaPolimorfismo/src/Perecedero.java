public class Perecedero extends Producto{
    public Perecedero(String nombre, double precio, int diasParaCaducar) {
        super(nombre, precio);
        this.diasParaCaducar = diasParaCaducar;
    }

    private int diasParaCaducar;

    public int getDiasParaCaducar() {
        return diasParaCaducar;
    }

    public void setDiasParaCaducar(int diasParaCaducar) {
        this.diasParaCaducar = diasParaCaducar;
    }

    @Override
    public String toString() {
        return "Producto " + this.getNombre() + " precio: $" + this.getPrecio() +
                "diasParaCaducar= " + diasParaCaducar;
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        switch (diasParaCaducar) {
            case 1: return (super.calcular(cantidadDeProductos))/4;
            case 2: return (super.calcular(cantidadDeProductos))/3;
            case 3: return (super.calcular(cantidadDeProductos))/2;
            default: return super.calcular(cantidadDeProductos);
        }
    }
}
