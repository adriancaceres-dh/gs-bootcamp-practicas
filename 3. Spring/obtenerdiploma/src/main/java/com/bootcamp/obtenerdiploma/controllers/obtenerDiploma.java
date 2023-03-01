package com.bootcamp.obtenerdiploma.controllers;


import dto.AlumnoDto;
import dto.MateriaDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class obtenerDiploma {
    @PostMapping("/obtenerDiploma")
    public String  calcularNota(@RequestBody AlumnoDto alumnoDto){
        System.out.println(alumnoDto);
        String respuesta = "nada";
        /*
        try {
            double acuNotas = 0.0;
            for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
                acuNotas += materiaDto.getNota();
            }
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            return "El promedio es " + promedio;
        } catch (Exception e) {
            return "No hay materias para calcular el promedio";
        }




    }
*/

        return respuesta;
    }}