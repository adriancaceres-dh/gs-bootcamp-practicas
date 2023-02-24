package Banco;

public class RetiroEfectivo extends Transaccion{
    @Override
    public void transaccionOK() {
        System.out.println("Puedes realizar retiros en efectivo");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puedes realizar retiros en efectivo");
    }
}
