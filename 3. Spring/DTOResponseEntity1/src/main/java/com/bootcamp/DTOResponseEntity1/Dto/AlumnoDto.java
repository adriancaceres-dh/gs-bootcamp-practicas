package com.bootcamp.DTOResponseEntity1.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor // todos los constructores
@NoArgsConstructor  //el constructur vacio
@Data //getter and setter
public class AlumnoDto {
    private String nombre;

    private List<MateriasDto> materias=new ArrayList<>();

}
