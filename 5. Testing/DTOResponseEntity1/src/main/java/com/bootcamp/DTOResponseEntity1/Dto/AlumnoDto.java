package com.bootcamp.DTOResponseEntity1.Dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor // todos los constructores
@NoArgsConstructor  //el constructur vacio
@Data
@Getter
@Setter//getter and setter
public class AlumnoDto {
    private String nombre;

    private List<MateriasDto> materias=new ArrayList<>();


    public List<MateriasDto> getLista() {
        return null;
    }
}
