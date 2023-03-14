package com.bootcamp.obtenerDiploma.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Materia {
    private String nombre;
    private Double nota;
}
