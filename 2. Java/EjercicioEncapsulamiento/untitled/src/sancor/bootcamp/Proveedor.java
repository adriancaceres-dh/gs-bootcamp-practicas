package sancor.bootcamp;

public class Proveedor extends Persona {
    private String codigoProveedor;

    public Proveedor(String nombre, String dni, String codigoProveedor) {
        super(nombre, dni);
        this.codigoProveedor = codigoProveedor;
    }

    @Override
    public String enviarMensaje() {
        return super.enviarMensaje();
    }
}
