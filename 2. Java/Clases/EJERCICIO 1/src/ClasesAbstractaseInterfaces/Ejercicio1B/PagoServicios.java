package ClasesAbstractaseInterfaces.Ejercicio1B;

public class PagoServicios extends Transaccion{
    @Override
    public void transaccionOK() {
        System.out.println("Puedes pagar servicios.");
    }

    @Override
    public void transaccionNOOK() {
        System.out.println("NO puedes pagar servicios.");
    }
}
