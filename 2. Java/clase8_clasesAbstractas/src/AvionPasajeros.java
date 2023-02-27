public class AvionPasajeros extends Aeronave implements Volador{

    private String cantidadAzafatas;

    public AvionPasajeros(String bandera, int cantidadDePasajeros, String piloto, String cantidadAzafatas) {
        super(bandera, cantidadDePasajeros, piloto);
        this.cantidadAzafatas = cantidadAzafatas;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avion de pasajeros");
    }

    @Override
    public void despegar() {
        System.out.println("Despega avion de pasajeros");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterriza avion de pasajeros");
    }
}
