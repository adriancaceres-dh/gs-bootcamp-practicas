package ClasesAbstractaseInterfaces.Ejercicio1B;

public class Transferencia extends Transaccion{
    @Override
    public void transaccionOK() {
        System.out.println("Puedes realizar transferencias.");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("NO puedes realizar transferencias.");
    }
}
