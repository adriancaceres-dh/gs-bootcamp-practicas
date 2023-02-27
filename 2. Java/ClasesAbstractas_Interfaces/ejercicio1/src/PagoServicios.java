public class PagoServicios extends TiposTransacciones {
    @Override
    public void transaccionOk() {
        System.out.println("Puedes realizar pagos de servicios");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("NO puedes realizar pagos de servicios");
    }
}
