public class AvionCarga extends Aeronave implements Volador{
    private String capacidadMaxima;

    public AvionCarga(String bandera, int cantidadDePasajeros, String piloto, String capacidadMaxima) {
        super(bandera, cantidadDePasajeros, piloto);
        this.capacidadMaxima = capacidadMaxima;
    }


    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avion de carga");
    }

    @Override
    public void despegar() {
        System.out.println("Despegar avion de carga, capacidad " + this.capacidadMaxima );
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterrizar avion de carga, capacidad " + this.capacidadMaxima);
    }
}