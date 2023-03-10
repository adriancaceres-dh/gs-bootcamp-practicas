package com.diploma.entregaDiploma.controller;

import com.diploma.entregaDiploma.dto.AlumnoDto;
import com.diploma.entregaDiploma.dto.MateriasDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {
@PostMapping("/obtenerDiploma")
    public String calcularNota(AlumnoDto alumnoDto) {
        String respuesta = "nada";
        try {
            double acuNotas = 0.0;
            for (MateriasDto materiasDto : alumnoDto.getMaterias()) {
                acuNotas += materiasDto.getNota();
            }
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta = "El promedio es " + promedio;
        } catch (Exception e) {
            respuesta = "No hay materias para calcular el promedio";
        }
        return respuesta;
    }

}
