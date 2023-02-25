package com.bootcamp.productos;

public class Perecedero extends Producto{
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
        return "com.bootcamp.productos.Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    @Override
    public double Calcular(int cantidadDeProductos) {
        double result = super.Calcular(cantidadDeProductos); //getPrecio() * cantidadDeProductos;
        if(this.getDiasPorCaducar() == 1) {
            result = result / 4;
        } else if (this.getDiasPorCaducar() == 2) {
            result = result / 3;
        } else {
            result = result / 2;
        }
        return result;
    }
}
