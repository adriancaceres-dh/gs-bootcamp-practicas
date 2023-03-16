package com.bootcamp.dtoResponseEntity.controller;
import com.bootcamp.dtoResponseEntity.dto.AlumnoDto;
import com.bootcamp.dtoResponseEntity.dto.MateriaDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class ObtenerDiploma {
    //@RequestBody son los datos que se envían en el cuerpo de la petición utilizando HTTP POST.
    // En otras palabras, la información de los datos va junto con la información de toda la petición,
    // no en la url.
    @PostMapping("/obtenerdiploma")
    public ResponseEntity<String> calcularNota(@RequestBody @valid AlumnoDto alumnoDto) {
        // Todos los cálculos van en la capa de servicios
        // recorrer la lista de notas y calcular el promedio
        // devolver un mensaje con el resultado
        // Forma 1, recorro con for y calculo
        // System.out.println(alumnoDto);

        String respuesta = "";
        try {
            double acuNotas = 0.0;
            for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNotas();
            }
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta = "El promedio es " + promedio;
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        } catch (Exception e) {
            respuesta = "No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }


        //Forma 2: Stream
        /*Double promedio = alumnoDto.getNombre();//lista de materias
        .stream().mapToDouble(n -> n.getNota()).average().orElseThrow();*/
    }
}


