public class AvionPrivado extends Aeronave{

    private String confort;

    public AvionPrivado(String bandera, int cantidadDePasajeros, String piloto, String confort) {
        super(bandera, cantidadDePasajeros, piloto);
        this.confort = confort;
    }


    @Override
    public void cambiarPiloto(String cambioPiloto) {
        System.out.println("Cambio piloto en avion privado");
    }
}