package Banco;

public class Basic extends Cliente{
    public Basic(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    @Override
    public void tareasPermitidas() {
        PagoDeServicios PagoDeServicios = new PagoDeServicios();
        PagoDeServicios.transaccionNOOK();
        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionNOOK();
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionNOOK();
    }

    @Override
    public void tareasNoPermitidas() {
        Deposito deposito = new Deposito();
        deposito.transaccionOK();
        Transferencia transferencia = new Transferencia();
        transferencia.transaccionOK();
    }
}
