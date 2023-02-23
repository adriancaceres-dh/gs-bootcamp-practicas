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
    public double calcular(int cantidadDeProductos){
        double precioTotal = super.calcular(cantidadDeProductos);

        if(diasPorCaducar == 1){
            precioTotal = precioTotal / 4;
        }else if(diasPorCaducar == 2){
            precioTotal = precioTotal / 3;
        }else if(diasPorCaducar == 3){
            precioTotal = precioTotal / 2;
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return '{' + super.toString() +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }
}
