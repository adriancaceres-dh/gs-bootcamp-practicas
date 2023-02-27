public class Ejecutivo extends Cliente{


    public Ejecutivo(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public void tareasPosibles() {
        Deposito deposito = new Deposito();
        deposito.transaccionOk();

        Transferencia transferencia = new Transferencia();
        transferencia.transaccionOk();
    }

    @Override
    public void tareasNoPosibles() {
        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionNoOk();
        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionNoOk();
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionNoOk();
    }
}
