package ejercicios.clasesabstractaseinterfaces.banco;

public class Deposito extends Transaccion{

    @Override
    public void transaccionOK() {
        System.out.println("Puede realizar depósitos");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("NO puede realizar depósitos");
    }
}
