package ejercicios.clasesabstractaseinterfaces.banco;

public class Cobradores extends Cliente{

    public Cobradores (String nombre, Integer DNI){
        super(nombre, DNI);
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
        Deposito depositos = new Deposito();
        depositos.transaccionNOOK();

        Transferencia transferencias = new Transferencia();
        transferencias.transaccionNOOK();

        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionNOOK();
    }


}
