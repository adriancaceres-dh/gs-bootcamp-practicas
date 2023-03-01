package controllers;

import DTO.AlumnoDto;
import DTO.AsignaturaDto;
import DTO.MensajeDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Diploma {
    @PostMapping("/alumnos")
    public MensajeDto calcularPromedio(@RequestBody AlumnoDto alumnoDto) {
        //Forma 1, stream
        //recorre la lista de nota y calcula el promedio y devuelve el mensaje con el resultado
        // OptionalDoble
        //Todos los calculos van en la capa de servicios

        double promedio = alumnoDto.getAsignaturas().stream().mapToDouble(AsignaturaDto::getNota).average().orElse(0.0);
        String mensaje = "El promedio del alumno " + alumnoDto.getNombre() + " es " + promedio;
        if (promedio > 9.0) {
            mensaje += ". Felicitaciones por tu desempeño durante el año!";
        }
        return new MensajeDto(mensaje, promedio, alumnoDto.getNombre());

        //Forma 2
        /*
        String mensaje ="";
        try{
        double acuNotas= 0.0;
        for(AsignaturaDto asignaturaDto: AlumnoDto alumnoDto()){
        acuNotas += AsignaturasDto.getNota();
        }
        double promedio = acuNotas/alumnoDto.getAsignaturas().size();
        respuesta = "El promedio es " +
        } catch (Excepction e){
        return "No hay materias para calcular promedios";
        }
        }
         */
    }
}

