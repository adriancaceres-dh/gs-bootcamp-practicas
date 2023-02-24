package Banco;

public class PagoDeServicios extends Transaccion {

    @Override
    public void transaccionOK() {
        System.out.println("Puedes realizar pagos de servicios");
    }

    @Override
    public void transaccionNOOK() {

        System.out.println("No puedes realizar pagos de servicios");
    }
}
