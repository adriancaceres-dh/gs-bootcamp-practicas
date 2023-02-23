package entidades;

public class AvionPrivado extends Aeronave implements Volador{

    private String confort; //1 maximo 2 medio

    public AvionPrivado(String bandera, int canitidadPasajeros, String confort) {
        super(bandera, canitidadPasajeros);
        this.confort = confort;
    }

    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Avion privado");
    }

    @Override
    public void despegar() {
        System.out.println("Desoegar avion privado");
    }

    @Override
    public void aterrizar() {
        System.out.println("Aterriza avion privado");
    }
}
