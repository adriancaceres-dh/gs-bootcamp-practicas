package com.bootcamp.EjercicioDiploma.Controller;

import dto.AlumnoDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {
    Double promedio = alumno.getMateras()
            .stram().mapToDouble(n -> n.getNota()).average()
            .orElseThrow();

    public String calcularNota(AlumnoDto alumnoDto) {

    }

    /*
    String respuesta = "";
        try {
                double acuNotas = 0.0;
                for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNota();
                }
                double promedio = acuNotas / alumnoDto.getMaterias().size();
                return "El promedio es " + promedio;
                } catch (Exception e) {
                return "No hay materias para calcular el promedio";
                }

     */

}
        }
