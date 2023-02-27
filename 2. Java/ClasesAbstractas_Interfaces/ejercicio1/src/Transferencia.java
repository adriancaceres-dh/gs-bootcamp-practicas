public class Transferencia extends TiposTransacciones{
    @Override
    public void transaccionOk() {
        System.out.println("Puedes realizar trasnferencias");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("NO puedes realizar trasnferencias");
    }
}
