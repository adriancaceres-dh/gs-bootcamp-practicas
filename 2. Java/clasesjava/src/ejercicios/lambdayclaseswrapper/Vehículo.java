package ejercicios.lambdayclaseswrapper;

public class Vehículo{
    //atrbutos

    private String modelo;
    private String marca;
    private Double precio;

    //constructor
    public Vehículo(String modelo, String marca, Double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    //getter and setter
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehículo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
