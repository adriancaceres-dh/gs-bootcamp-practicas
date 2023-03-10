package com.bootcamp.DTOResponseEntity1.Dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter

public class Diploma {
    private String alumno;
    private double promedio;
    private String mensaje;

    public Diploma(String nombre) {
    }


    public void calcularPromedio(List<MateriasDto> asignaturas) {
        double promedio = 0.00;
        int cantidad = 0;
        for (MateriasDto asignatura : asignaturas) {
            promedio = promedio + asignatura.getNotas();
            cantidad++;
        }
        this.setPromedio(promedio/cantidad);
    }

    public void saludo() {
        if(this.getPromedio() >= 9) {
            this.setMensaje("Felicitaciones, buen promedio");
        }

    }
}
