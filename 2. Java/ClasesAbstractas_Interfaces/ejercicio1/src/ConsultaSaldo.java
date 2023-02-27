public class ConsultaSaldo extends TiposTransacciones {
    @Override
    public void transaccionOk() {
        System.out.println("Puedes realizar consultas de saldo");
    }

    @Override
    public void transaccionNoOk() {

        System.out.println("NO puedes realizar consultas de saldo");
    }
}
