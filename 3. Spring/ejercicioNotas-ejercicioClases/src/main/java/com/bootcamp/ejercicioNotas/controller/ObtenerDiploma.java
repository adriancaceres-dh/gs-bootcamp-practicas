package com.bootcamp.ejercicioNotas.controller;

import com.bootcamp.ejercicioNotas.dto.AlumnoConPromedioDto;
import com.bootcamp.ejercicioNotas.dto.AlumnoDto;
import com.bootcamp.ejercicioNotas.dto.MateriaDto;
import com.bootcamp.ejercicioNotas.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObtenerDiploma {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public ResponseEntity<List<AlumnoConPromedioDto>> getAlumnoConPromedio(){
        return new ResponseEntity<>(alumnoService.getAlumnosConPromedio(), HttpStatus.OK);
    }

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
