package ClasesAbstractaseInterfaces.Ejercicio1B;

public class Ejecutivos extends Cliente{
    public Ejecutivos(String nombre, String DNI) {
        super(nombre, DNI);
    }

    @Override
    public void tareasPosibles() {
        Deposito deposito = new Deposito();
        deposito.transaccionOK();
        Transferencia transferencia = new Transferencia();
        transferencia.transaccionOK();
    }

    @Override
    public void tareasNoPermitidas() {
        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionNOOK();
        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionNOOK();
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionNOOK();
    }
}
