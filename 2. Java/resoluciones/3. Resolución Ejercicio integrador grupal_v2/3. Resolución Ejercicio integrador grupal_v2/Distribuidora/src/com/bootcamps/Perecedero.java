package com.bootcamps;

/**
 * Clase Perecedero, clase hija o sublcase de Producto
 */
public class Perecedero extends Producto {

    //Atributo
    private int diasPorCaducar;

    //Constructor
    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    //Métodos
    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return super.toString() + " Días por caducar=" + diasPorCaducar;
    }

    /**
     * Calcula el precio según una cantidad de productos,
     * tambien según los días que le queden al producto,
     * se reducirá el precio.
     * <ul>
     * <li>1: 4 veces menos</li>
     * <li>2: 3 veces menos</li>
     * <li>3: 2 veces menos</li>
     * </ul>
     * @param cantidadDeProductos
     * @return
     */
    @Override
    public double calcular(int cantidadDeProductos) {

        double precioFinal = super.calcular(cantidadDeProductos);

        switch (diasPorCaducar) {
            case 1:
                precioFinal /= 4;
                break;
            case 2:
                precioFinal /= 3;
                break;
            case 3:
                precioFinal /= 2;
                break;
        }

        return precioFinal;

    }
}
