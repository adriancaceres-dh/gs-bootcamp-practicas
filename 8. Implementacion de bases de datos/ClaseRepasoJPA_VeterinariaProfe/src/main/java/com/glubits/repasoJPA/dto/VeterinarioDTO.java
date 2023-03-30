package com.glubits.repasoJPA.dto;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VeterinarioDTO {

    private Integer id;

    private String nombre;

    private String matricula;

    private String especialidad;

    private String horario;

    private String telefono;
}
