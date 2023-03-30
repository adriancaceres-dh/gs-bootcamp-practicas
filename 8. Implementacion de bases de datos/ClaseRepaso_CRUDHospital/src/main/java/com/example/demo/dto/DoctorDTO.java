package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DoctorDTO {

    private Integer id;

    private String nombre;

    private String apellido;

    private Integer edad;

    private String especialidad;
}
