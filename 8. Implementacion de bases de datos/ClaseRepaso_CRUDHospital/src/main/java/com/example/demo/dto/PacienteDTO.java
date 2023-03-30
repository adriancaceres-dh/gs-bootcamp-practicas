package com.example.demo.dto;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Tutor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PacienteDTO {

    private String nombre;

    private String apellido;

    private Short edad;

    private Integer documento;

    private Tutor tutor;

    private Doctor doctor;
}
