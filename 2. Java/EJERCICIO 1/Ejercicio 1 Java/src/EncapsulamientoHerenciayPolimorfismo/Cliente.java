package EncapsulamientoHerenciayPolimorfismo;

public class Cliente extends Persona{ // Para evitar copiar y pegar la clase persona

    private String numeroCliente;
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
        return "Cliente {" + "nombre " + this.getNombre() + " " +
                "numeroCliente='" + numeroCliente + '\'' +
                '}';
    }

    @Override
    public String enviarMensaje() {
        return "Enviar email con promociones";
    }
}

