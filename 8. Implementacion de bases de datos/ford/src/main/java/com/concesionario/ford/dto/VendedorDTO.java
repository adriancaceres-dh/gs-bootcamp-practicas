package com.concesionario.ford.dto;


import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendedorDTO {

    private Integer id;

    private String nombre;

    private String telefono;

    private String horario;
}
