package com.bootcamps;



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