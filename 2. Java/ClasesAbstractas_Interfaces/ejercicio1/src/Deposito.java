public class Deposito extends TiposTransacciones{
    @Override
    public void transaccionOk() {
        System.out.println("Puedes realizar depósitos");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("NO puedes realizar depósitos");
    }
}
