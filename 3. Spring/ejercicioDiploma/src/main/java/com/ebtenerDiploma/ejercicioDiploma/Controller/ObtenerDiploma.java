package com.ebtenerDiploma.ejercicioDiploma.Controller;

import com.ebtenerDiploma.ejercicioDiploma.dto.AlumnoDto;
import com.ebtenerDiploma.ejercicioDiploma.dto.MateriaDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {
    try {
        double acuNotas = 0.0;
        for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
            acuNotas += materiaDto.getNota();
        }
        double promedio = acuNotas / alumnoDto.getMaterias().size();
        respuesta = "El promedio es " + promedio;
    } catch (Exception e) {
        respuesta =  "No hay materias para calcular el promedio";
    }

    return respuesta;
    /*public String calcularNota(AlumnoDto alumnoDto) {
        Double double = alumnoDto.getMaterias()
                .stream().mapToDouble(n -> n.getNota()).average()
                .get.orElsethrow(new);
    }*/

}
