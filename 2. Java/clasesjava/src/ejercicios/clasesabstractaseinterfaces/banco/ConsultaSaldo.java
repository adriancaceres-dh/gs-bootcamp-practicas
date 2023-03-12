package ejercicios.clasesabstractaseinterfaces.banco;

public class ConsultaSaldo extends Transaccion{
    @Override
    public void transaccionOK() {
        System.out.println("Puede realizar Consulta de Saldo");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puede realizar Consulta de Saldo");
    }
}
