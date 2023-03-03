package com.certificado.certificado;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }


}
