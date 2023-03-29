public class Vehiculo implements Comparable<Vehiculo>{
    private String modelo;
    private String marca;
    private Integer precio;

    public Vehiculo(String modelo, String marca, Integer precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }




    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +'\n'
                ;
    }

    @Override
    public int compareTo(Vehiculo o) {
        if(this.precio.compareTo(o.precio) == 0)
            return this.modelo.compareTo(o.modelo);
        else{
            return this.precio.compareTo(o.precio);
        }
    }
}
