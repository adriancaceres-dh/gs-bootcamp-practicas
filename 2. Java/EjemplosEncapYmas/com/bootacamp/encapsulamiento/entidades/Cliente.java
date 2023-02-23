package com.bootacamp.encapsulamiento.entidades;


//EXTENCION DE LA CLASE PERSONA, PARA TRAER SU INFO
public class Cliente extends Persona {

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
//    List<Persona> personas = new ArrayList<>();
//        personas.add(new Cliente("Carlos","34555"));
//        personas.add(new Proveedor("Arcor","345325","dd"));
//
//        for (Persona persona: personas ) {
//        System.out.println(persona.enviarMensaje());
//    }

}

