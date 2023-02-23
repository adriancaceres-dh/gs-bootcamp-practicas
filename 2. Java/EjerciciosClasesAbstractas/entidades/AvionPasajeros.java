package entidades;

public class AvionPasajeros extends Aeronave implements Volador{

    private String cantidadAzafatas;

    public AvionPasajeros(String bandera, int canitidadPasajeros, String cantidadAzafatas) {
        super(bandera, canitidadPasajeros);
        this.cantidadAzafatas = cantidadAzafatas;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio avion de pasajeros");
    }

    @Override
    public void despegar() {
        System.out.println("Despega avion de pasajeros");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterriza avion pasajeros");
    }
}
