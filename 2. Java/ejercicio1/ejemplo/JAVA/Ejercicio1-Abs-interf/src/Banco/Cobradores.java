package Banco;


public class Cobradores extends Cliente {

    public Cobradores(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    @Override
    public void tareasPermitidas() {
        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionOK();
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionOK();
    }

    @Override
    public void tareasNoPermitidas() {
        Deposito deposito = new Deposito();
        deposito.transaccionNOOK();
        Transferencia transferencia = new Transferencia();
        transferencia.transaccionNOOK();
        PagoDeServicios PagoDeServicios = new PagoDeServicios();
        PagoDeServicios.transaccionNOOK();
    }
}

