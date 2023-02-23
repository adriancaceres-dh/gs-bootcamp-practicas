package entidades;

public abstract class Aeronave implements Volador { //FALTA COMPLETAR
    private String bandera;
    private int canitidadPasajeros;
    private String piloto;

    public Aeronave(String bandera, int canitidadPasajeros) {
        this.bandera = bandera;
        this.canitidadPasajeros = canitidadPasajeros;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public int getCanitidadPasajeros() {
        return canitidadPasajeros;
    }

    public void setCanitidadPasajeros(int canitidadPasajeros) {
        this.canitidadPasajeros = canitidadPasajeros;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public abstract void cambiarPiloto(String cambioPiloto);
}
