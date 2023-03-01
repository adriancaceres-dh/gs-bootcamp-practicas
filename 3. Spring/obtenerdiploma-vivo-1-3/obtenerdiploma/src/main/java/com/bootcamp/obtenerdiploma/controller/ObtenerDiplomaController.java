package com.bootcamp.obtenerdiploma.controller;

import com.bootcamp.obtenerdiploma.dto.AlumnoConPromedioDto;
import com.bootcamp.obtenerdiploma.dto.AlumnoDto;
import com.bootcamp.obtenerdiploma.dto.MateriaDto;
import com.bootcamp.obtenerdiploma.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ObtenerDiplomaController {

    @Autowired
    AlumnoService alumnoService;
    @GetMapping("/alumnos")
    public ResponseEntity<List<AlumnoConPromedioDto>> getAlumnosConPromedio() {
        return new ResponseEntity<>(alumnoService.getAlumnosConPromedio(),HttpStatus.OK);
    }

    @PostMapping("/alumnos")
    public ResponseEntity<String> agregarAlumno(@RequestBody AlumnoDto alumnoDto) {
        return new ResponseEntity<>(alumnoService.agregarAlumno(alumnoDto), HttpStatus.OK);
    }

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
