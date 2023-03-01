package Clase3.sp.obtenerDiploma.controller;

import Clase3.sp.obtenerDiploma.dto.AlumnoConPromedioDto;
import Clase3.sp.obtenerDiploma.dto.AlumnoDto;
import Clase3.sp.obtenerDiploma.dto.MateriaDto;
import Clase3.sp.obtenerDiploma.service.AlumnoService;
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
    public ResponseEntity<List<AlumnoConPromedioDto>>getAlumosConPromedio(){
        return new ResponseEntity<>(alumnoService.getAlumnosConPromedio(),HttpStatus.OK);
    }

    @PostMapping("/obtenerdiploma")
    public ResponseEntity <String> calcularNota(@RequestBody AlumnoDto alumnoDto){

        //recorrer la lista de notas y calcular el promedio.
        //luego devolver el resultado, un msj.

        //Forma 1 recorro con for y calculo.

        String respuesta ="";

        try {
           double acuNotas = 0.0;
            for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
               acuNotas += materiaDto.getNota();
            }
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta="El promedio es: "+respuesta;
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        }catch (Exception e){
            respuesta="No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }

        //Forma 2 usar stream.
        //Double promedio = alumnoDto.getMaterias()
          //      .stream().mapToDouble(n -> n.getNota()).average()
           //     .orElseThrow();

    }
}
