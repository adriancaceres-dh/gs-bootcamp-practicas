package com.diploma.diplomaAlumnos.controller;

import com.diploma.diplomaAlumnos.dto.AlumnoConPromedioDto;
import com.diploma.diplomaAlumnos.dto.AlumnoDto;
import com.diploma.diplomaAlumnos.dto.MateriaDto;
import com.diploma.diplomaAlumnos.service.AlumnoService;
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
    public ResponseEntity<List<AlumnoConPromedioDto>> getAlumnoConPromedio(){
        return new ResponseEntity<>(alumnoService.getAlumnosConPromedio(),HttpStatus.OK);
    }


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
