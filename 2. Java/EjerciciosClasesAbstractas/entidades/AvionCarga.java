package entidades;

public class AvionCarga extends Aeronave implements Volador{

    private String capacidadMaxima;

    public AvionCarga(String bandera, int canitidadPasajeros, String capacidadMaxima) {
        super(bandera, canitidadPasajeros);
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avion carga");
    }

    @Override
    public void despegar() {
        System.out.println("Desoega avion carga, capacidad " + this.capacidadMaxima);
    }

    @Override
    public void aterrizar() {
        System.out.println();
    }
}
