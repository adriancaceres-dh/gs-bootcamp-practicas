public class Vehiculos {

    private String modelo;
    private String marca;

    private double costo;

    public Vehiculos() {}

    public Vehiculos(String modelo, String marca, int costo) {
        this.marca = modelo;
        this.modelo = marca;
        this.costo = costo;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
