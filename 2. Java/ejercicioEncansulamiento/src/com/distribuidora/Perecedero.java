package com.distribuidora;

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
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }


    public double calcular(int cantidadDeProductos){
        double result = super.calcular(cantidadDeProductos);//getPrecio() * cantidadDeProductos;

        if(this.getDiasPorCaducar() == 1){
            result = result/4;
        } else if (this.getDiasPorCaducar() == 2){
            result = result/ 3;
        } else {
            result = result/2;
        }
        return result;
    }
}
