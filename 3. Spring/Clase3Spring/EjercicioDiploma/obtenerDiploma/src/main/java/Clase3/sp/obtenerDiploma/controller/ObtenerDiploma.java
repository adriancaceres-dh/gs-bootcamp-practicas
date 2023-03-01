package Clase3.sp.obtenerDiploma.controller;

import Clase3.sp.obtenerDiploma.dto.AlumnoDto;
import Clase3.sp.obtenerDiploma.dto.MateriaDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiploma {
    public String calcularNota(AlumnoDto alumnoDto){
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
            return "El promedio es: "+promedio;
        }catch (Exception e){
            return "No hay mmaterias para calcular el promedio";
        }
        //Forma 2 usar stream.
        //Double promedio = alumnoDto.getMaterias()
          //      .stream().mapToDouble(n -> n.getNota()).average()
           //     .orElseThrow();



    }
}
