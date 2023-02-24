package Banco;

public class Ejecutivos extends Cliente{
    public Ejecutivos(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    @Override
    public void tareasPermitidas() {
        Deposito deposito = new Deposito();
        deposito.transaccionOK();
        Transferencia transferencia = new Transferencia();
        transferencia.transaccionOK();
    }

    @Override
    public void tareasNoPermitidas() {
        PagoDeServicios PagoDeServicios = new PagoDeServicios();
        PagoDeServicios.transaccionNOOK();
        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionNOOK();
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionNOOK();
    }
}
