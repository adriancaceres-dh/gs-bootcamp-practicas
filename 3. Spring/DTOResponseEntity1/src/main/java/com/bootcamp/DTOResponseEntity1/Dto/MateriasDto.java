package com.bootcamp.DTOResponseEntity1.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // todos los constructores
@NoArgsConstructor  //el constructur vacio
@Data //getter and setter
public class MateriasDto {
    private String nombre;

    private  Double notas;

}
