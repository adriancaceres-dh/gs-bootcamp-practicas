package ejercicios.clasesabstractaseinterfaces.banco;

public class Basic extends Cliente{

    public Basic (String nombre, Integer DNI){
        super(nombre, DNI);
    }

    @Override
    public void tareasPermitidas() {
        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionOK();

        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionOK();

        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionOK();
    }

    @Override
    public void tareasNoPermitidas() {
        Deposito depositos = new Deposito();
        depositos.transaccionNOOK();

        Transferencia transferencias = new Transferencia();
        transferencias.transaccionNOOK();
    }


}
