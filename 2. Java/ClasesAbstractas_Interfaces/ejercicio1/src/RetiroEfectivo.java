public class RetiroEfectivo extends TiposTransacciones{
    @Override
    public void transaccionOk() {
        System.out.println("Puedes realizar retiros de efectivo");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("NO puedes realizar retiros de efectivo");
    }
}
