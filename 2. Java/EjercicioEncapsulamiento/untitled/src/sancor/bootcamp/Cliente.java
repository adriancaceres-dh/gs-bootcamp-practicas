package sancor.bootcamp;

public class Cliente extends Persona {

    private  String numeroCliente;

    public Cliente(String nombre, String dni) {
        super(nombre, dni);
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente='" + numeroCliente + '\'' +
                '}';
    }

    @Override
    public String enviarMensaje() {
        return super.enviarMensaje();
    }
}
