public abstract class Aeronave {
    private String bandera;
    private int cantidadDePasajeros;
    private String piloto;

    public Aeronave(String bandera, int cantidadDePasajeros, String piloto) {
        this.bandera = bandera;
        this.cantidadDePasajeros = cantidadDePasajeros;
        this.piloto = piloto;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadDePasajeros(int cantidadDePasajeros) {
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public abstract void cambiarPiloto(String cambioPiloto);
}