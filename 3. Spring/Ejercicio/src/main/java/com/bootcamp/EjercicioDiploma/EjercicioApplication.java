package com.bootcamp.EjercicioDiploma;

import dto.MateriaDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import java.sql.SQLOutput;

@SpringBootApplication
public class EjercicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioApplication.class, args);
    }

    // Todos los calculos van en la capa de servicios
    // recorrer la lista de notas y calcular el promedio
    // devolver un mensaje con el resultado
    // Forma 1, recorro con for y calculo
    // System.out.println(alunoDto)

    String respuesta = "";
	try

    {
        double acuNotas = 0.0;
        for (MateriaDto materiaDto : alumnoDto.getMaterias()){
        acuNotas += materiaDto.getNotas();
    }

        try {
            double promedio = acuNotas / alumnoDto.getMaterias().size();
            respuesta = "El promedio es " + promedio;
            return new ResponseEntity<>(respuesta, HttpStatus.Ok);
        } catch (Exception e) {
            respuesta = "No hay materias para calcular el promedio";
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);

        }
    }
}
