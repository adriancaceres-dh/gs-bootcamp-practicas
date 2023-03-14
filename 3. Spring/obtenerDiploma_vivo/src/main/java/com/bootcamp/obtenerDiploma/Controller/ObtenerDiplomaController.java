package com.bootcamp.obtenerDiploma.Controller;

import com.bootcamp.obtenerDiploma.Dto.AlumnoConPromedioDto;
import com.bootcamp.obtenerDiploma.Dto.AlumnoDto;
import com.bootcamp.obtenerDiploma.Dto.MateriaDto;
import com.bootcamp.obtenerDiploma.Models.Alumno;
import com.bootcamp.obtenerDiploma.Services.AlumnoService;
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
    public ResponseEntity<List<AlumnoConPromedioDto>> getAlumnosConPromedio(){
        return new ResponseEntity<>(alumnoService.getAlumnosConPromedio(), HttpStatus.OK);
    }


    @PostMapping("/obtenerdiploma")
    public ResponseEntity<String> calcularNota(@RequestBody AlumnoDto alumnoDto) {
        System.out.println(alumnoDto);

        String respuesta = " ";
        try {
            double acuNotas = 0.0;
            for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNota();
            }
            double promedio = Math.round(acuNotas / alumnoDto.getMaterias().size());
            respuesta = "El promedio es " + promedio;
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        } catch (Exception e) {
            respuesta = "No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }


    }
}
