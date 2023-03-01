package com.bootcamp.ejercicioNotas.controller;

import com.bootcamp.ejercicioNotas.dto.AlumnoDto;
import com.bootcamp.ejercicioNotas.dto.MateriaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {

    @PostMapping("/obtenerdiploma")
    public ResponseEntity<String> calcularNota(@RequestBody AlumnoDto alumnoDto) {

        // recorrer la lista de notas y calcular el promedio
        // devolver un mensaje con el resultado
        // Forma 1: recorro con for y calculo
        // Forma 2: usar stream
;
        String respuesta = "";
        try {
            double acuNotas = 0.0;
            for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNota();
            }
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta = "El promedio es " + promedio;
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        } catch (Exception e) {
            respuesta = "No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);

        }


    }
}
