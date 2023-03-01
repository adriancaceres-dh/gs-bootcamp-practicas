package ClasesAbstractaseInterfaces.Ejercicio1B;

public class Cobradores extends Cliente{
    public Cobradores(String nombre, String DNI) {
        super(nombre, DNI);
    }

    @Override
    public void tareasPosibles() {
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
        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionNOOK();
    }
}