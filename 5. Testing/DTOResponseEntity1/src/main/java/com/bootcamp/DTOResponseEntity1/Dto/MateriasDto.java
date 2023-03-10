package com.bootcamp.DTOResponseEntity1.Dto;

import lombok.*;

@AllArgsConstructor // todos los constructores
@NoArgsConstructor  //el constructur vacio
@Data
@Getter
@Setter//getter and setter
public class MateriasDto {
    private String nombre;

    private  Double notas;

}
