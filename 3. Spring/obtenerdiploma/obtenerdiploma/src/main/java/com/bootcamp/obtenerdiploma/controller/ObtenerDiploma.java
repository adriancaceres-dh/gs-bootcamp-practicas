package com.bootcamp.obtenerdiploma.controller;

import com.bootcamp.obtenerdiploma.dto.AlumnoDto;
import com.bootcamp.obtenerdiploma.dto.MateriaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {
    @PostMapping("/obtenerdiploma")
    public ResponseEntity<String> calcularNota(@RequestBody AlumnoDto alumnoDto) {
        // Todos los cálculos van en la capa de servicios
        // recorrer la lista de notas y calcular el promedio
        // devolver un mensaje con el resultado
        // Forma 1, recorro con for y calculo
        // System.out.println(alumnoDto);

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

        // Forma 2, stream
        /*
        Double promedio = alumnoDto.getMaterias()
                .stream().mapToDouble(n -> n.getNota()).average()
                .orElseThrow();
        */
    }
}
