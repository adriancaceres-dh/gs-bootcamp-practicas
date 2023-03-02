package com.bootcamp.EjercicioObtenerDiploma.Controller;

import com.bootcamp.EjercicioObtenerDiploma.dto.AlumnoDto;
import com.bootcamp.EjercicioObtenerDiploma.dto.AlumnoPromedioDto;
import com.bootcamp.EjercicioObtenerDiploma.dto.MateriaDto;
import com.bootcamp.EjercicioObtenerDiploma.service.AlumnoService;
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
    public ResponseEntity<List<AlumnoPromedioDto>> getAlumnosConPromedio() {
        return new ResponseEntity<>(alumnoService.getAlumnosConPromedio(),HttpStatus.OK);
    }
    @PostMapping("/obtenerdiploma")
    public ResponseEntity<String> calcularNota(@RequestBody AlumnoDto alumnoDto) {

        // Forma 1 recorrer el for y calcular

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
        }
        return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);


        // Forma 2, stream
        /*
        Double promedio = alumnoDto.getMaterias()
                .stream().mapToDouble((n -> n.getNota())).average()
                .orElseThrow()

         */
    }
}
