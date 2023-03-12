package ejercicios.clasesabstractaseinterfaces.banco;

public class Ejecutivos extends Cliente{

    //creamos un metodo que tiene como parametro dni y nombre y llamamos al constructor para setear sus atributos
    public Ejecutivos (String nombre, Integer DNI){
        super(nombre, DNI);
    }

    //aclaramos que tareas estan permitidas
    @Override
    public void tareasPermitidas() {
        //llamamos a la clase deposito
        Deposito depositos = new Deposito();
        depositos.transaccionOK(); //le agergamos el metodo correspondiente

        Transferencia transferencias = new Transferencia();
        transferencias.transaccionOK();
    }

    @Override
    public void tareasNoPermitidas() {
        RetiroEfectivo retiroEfectivo = new RetiroEfectivo();
        retiroEfectivo.transaccionNOOK();

        PagoServicios pagoServicios = new PagoServicios();
        pagoServicios.transaccionNOOK();

        ConsultaSaldo consultaSaldo = new ConsultaSaldo();
        consultaSaldo.transaccionNOOK();
    }
}
