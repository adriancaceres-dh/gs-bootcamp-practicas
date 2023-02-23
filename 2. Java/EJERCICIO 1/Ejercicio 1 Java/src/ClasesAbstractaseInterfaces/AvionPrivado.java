package ClasesAbstractaseInterfaces;
public class AvionPrivado extends AeroNave {

    private String confort;  // 1 max 2 medio

    public AvionPrivado(String bandera, int cantidadPasajeros, String confort) {
        super(bandera, cantidadPasajeros);
        this.confort = confort;
    }


    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio de piloto en avion privado");
    }

    @Override
    public void despegar() {
        System.out.println("despega avion privado");
    }

    @Override
    public void aterrizar() {
        System.out.println("aterriza avion privado");
    }
}
