package EncapsulamientoHerenciayPolimorfismo.EjerciciosPracticos;

public class NoPerecederos extends Producto{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NoPerecederos(String nombre, double precio,String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public double calcular(int cantidadDeProductos){
        return getPrecio() * cantidadDeProductos;
    }


    @Override
    public String toString() {
        return "NoPerecederos{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

}
