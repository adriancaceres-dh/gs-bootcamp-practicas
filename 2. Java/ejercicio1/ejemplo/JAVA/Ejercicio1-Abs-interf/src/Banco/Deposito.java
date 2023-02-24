package Banco;

public class Deposito extends Transaccion{

    @Override
    public void transaccionOK() {
        System.out.println("Puedes realizar depositos");

    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puedes realizar depositos");
    }
}
