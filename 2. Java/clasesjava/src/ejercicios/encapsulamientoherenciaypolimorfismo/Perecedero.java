package ejercicios.encapsulamientoherenciaypolimorfismo;

public class Perecedero extends Producto {
    //atributo
    Integer diasPorCaducar;

    public Perecedero(String nombre, Double precio, Integer diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }


    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    @Override
    public double calcular(Integer cantidadDeProductos){

        double precioFinal = super.calcular(cantidadDeProductos);

        if(diasPorCaducar == 1){
            precioFinal = precioFinal/4;

        } else if (diasPorCaducar == 2) {

            precioFinal = precioFinal/3;

        } else if (diasPorCaducar == 3) {
            precioFinal= precioFinal/2;
        }
        return precioFinal;

    }
}
