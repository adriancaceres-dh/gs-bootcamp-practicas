package com.bootcamp.encapsulamiento.entidades;

public class Cliente extends Persona implements TicketPromo{

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

    @Override
    public void caminar() {
        System.out.println("El cliente camina");
    }

    @Override
    public void obtenerTicket() throws Exception {
        try{
            Integer numero = Integer.parseInt(this.numeroCliente);
        }catch (Exception e){
            //System.out.println("Se produjo un error");
            throw new Exception("Se produjo un error");
        }
        System.out.println("Obtener ticket");
    }

    @Override
    public void anularTicket() {
        System.out.println("Anular Ticket");
    }
}
