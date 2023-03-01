package ClasesAbstractaseInterfaces.Ejercicio1B;

public class Basic extends Cliente{

    public Basic(String nombre, String DNI) {
        super(nombre, DNI);
    }

    @Override
    public void tareasPosibles() {
        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionNOOK();
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