public class Perecedero extends Producto {
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

    @Override
    public double Calcular(int cantidadDeProductos) {
        double precioFinal = super.Calcular(cantidadDeProductos);
        if (diasPorCaducar == 1) {
            precioFinal *= 0.25;

        } else if (diasPorCaducar == 2) {
            precioFinal *= 0.33;

        } else if (diasPorCaducar == 3) {
            precioFinal *= 0.50;
        }
        return precioFinal;
    }
}
