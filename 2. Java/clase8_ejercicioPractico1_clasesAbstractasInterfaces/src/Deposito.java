public class Deposito extends Transaccion{
    @Override
    public void transaccionOK() {
        System.out.println("Puedes realizar depósitos.");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("NO puedes realizar depósitos.");
    }
}
