package bootcamp.entidades;

public class Proveedor extends Persona {

    private String codigoProveedor;

    public Proveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Proveedor(String nombre, String dni, String codigoProveedor) {
        super(nombre, dni);
        this.codigoProveedor = codigoProveedor;
    }
}
