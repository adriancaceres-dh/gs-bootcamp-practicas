package ejercicios.clasesabstractaseinterfaces.banco;

public class Transferencia extends Transaccion{

    @Override
    public void transaccionOK() {
        System.out.println("Puede realizar transferencias");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puede realizar transferencias");
    }
}
