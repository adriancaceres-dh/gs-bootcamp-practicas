package ClasesAbstractaseInterfaces.Ejercicio1B;

public class RetiroEfectivo extends Transaccion{
    @Override
    public void transaccionOK() {
        System.out.println("Puedes retirar en efectivo.");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("NO puedes retirar en efectivo.");
    }
}
