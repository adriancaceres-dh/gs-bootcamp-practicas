public class Perecederos extends Producto {
    int diasPorCaducar;
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
    public String toString() {
        return "Perecederos{" +
                "diasPorCaducar=" + diasPorCaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public double calcularPrecio(int cantidadDeProductos){
        double resultado = cantidadDeProductos * this.precio;

        if(this.diasPorCaducar == 1){
            resultado = resultado / 4;
        }else if(this.diasPorCaducar == 2){
            resultado = resultado / 3;
        }else if(this.diasPorCaducar == 3){
            resultado = resultado / 2;
        }
        return resultado;
    }
}
