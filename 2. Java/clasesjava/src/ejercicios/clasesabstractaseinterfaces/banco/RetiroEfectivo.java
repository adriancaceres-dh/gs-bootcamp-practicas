package ejercicios.clasesabstractaseinterfaces.banco;

public class RetiroEfectivo extends Transaccion{

    @Override
    public void transaccionOK() {
        System.out.println("Puede realizar Retiro de Efectivo");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puede realizar Retiro de Efectivo");
    }
}
