package Banco;

public class ConsultaSaldo extends Transaccion{


    @Override
    public void transaccionOK() {
        System.out.println("Puedes consultar saldos");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puedes consultar saldos");
    }
}