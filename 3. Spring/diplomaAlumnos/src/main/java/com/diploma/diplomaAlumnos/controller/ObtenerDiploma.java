package com.diploma.diplomaAlumnos.controller;

import com.diploma.diplomaAlumnos.dto.AlumnoDto;
import com.diploma.diplomaAlumnos.dto.MateriaDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {
    @PostMapping("/obtenerdiploma")
    public ResponseEntity<String> calcularNota(@RequestBody AlumnoDto alumnoDto){

        String respuesta = "";
        try {
            double acuNotas = 0.0;
            for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNota();
            }
             double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta = "El promedio es "+ promedio;
        } catch (Exception e){
            respuesta = "No hay materias para calcular el promedio";
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);

        /*Double promedio = alumnoDto.getMaterias()
                .stream().mapToDouble(n->n.getNota()).average()
                        .orElseThrow();
    */
    }
}
