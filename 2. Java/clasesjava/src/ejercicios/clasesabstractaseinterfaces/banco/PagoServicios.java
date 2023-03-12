package ejercicios.clasesabstractaseinterfaces.banco;

public class PagoServicios extends Transaccion{

    @Override
    public void transaccionOK() {
        System.out.println("Puede realizar Pago de Servicios");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("No puede realizar Pago de Servicios");
    }
}
