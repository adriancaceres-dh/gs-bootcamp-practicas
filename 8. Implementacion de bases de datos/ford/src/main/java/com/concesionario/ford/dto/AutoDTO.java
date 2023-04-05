package com.concesionario.ford.dto;

import com.concesionario.ford.entity.Cliente;
import com.concesionario.ford.entity.Vendedor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutoDTO {

    private Integer id;

    private String patente;

    private String Modelo;


    private Vendedor vendedor;


    private Cliente cliente;
}
