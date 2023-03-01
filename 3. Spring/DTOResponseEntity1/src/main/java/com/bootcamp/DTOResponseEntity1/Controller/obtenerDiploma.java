package com.bootcamp.DTOResponseEntity1.Controller;

import com.bootcamp.DTOResponseEntity1.Dto.AlumnoDto;
import com.bootcamp.DTOResponseEntity1.Dto.MateriasDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class obtenerDiploma{

    @PostMapping
    public ResponseEntity<String> calcularNota(@RequestBody AlumnoDto alumnoDto){
        //TODOS LOS CALCULOS VAN EN LA PARTE DE SERVICIO

        //Recorrer la lista de notas y calcular el promedio
        //luego devolver un mensaje con el resultado

        //FORMA 1 recooro con un for y calculo
        String respuesta = " ";
        try {
            double acuNotas = 0.0;
            for (MateriasDto materiasDto : alumnoDto.getMaterias()) {
                acuNotas += materiasDto.getNotas();
            }
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta ="El promedio es " + promedio;
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }catch (Exception e){//intentemos dividir por cero
            respuesta ="No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }




        /*
        //FORMA 2 es usar String
        Double promedio = alumnoDto.getMaterias()//aca tengo lista materias
                //quiero una lista de numero, le digo por cada nota
                //quiero que solo me devuelva la nota, y quiero que calcule el promedio
                // y si hay algun problema que lance una excepcion
                .stream().mapToDouble(n -> n.getNotas()).average().orElseThrow(new Exception())

         */


    }
}
