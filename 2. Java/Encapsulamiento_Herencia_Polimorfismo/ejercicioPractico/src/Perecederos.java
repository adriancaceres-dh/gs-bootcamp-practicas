public class Perecederos extends Producto {

    private int diasPorCaducar;

    public Perecederos(String nombre, double precio, int diasPorCaducar) {
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
    public double Calcular(int cantidadDeProductos) {
        double precioFinal = super.Calcular(cantidadDeProductos);
        if (diasPorCaducar == 1) {
            precioFinal *= 0.25; // reducir 4 veces el precio final
        } else if (diasPorCaducar == 2) {
            precioFinal *= 0.33; // reducir 3 veces el precio final
        } else if (diasPorCaducar == 3) {
            precioFinal *= 0.5; // reducir a la mitad el precio final
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "Perecederos{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }
}

