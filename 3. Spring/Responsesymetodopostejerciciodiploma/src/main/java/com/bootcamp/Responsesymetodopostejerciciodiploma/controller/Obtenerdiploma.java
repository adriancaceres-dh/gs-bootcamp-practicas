package com.bootcamp.Responsesymetodopostejerciciodiploma.controller;

import com.bootcamp.Responsesymetodopostejerciciodiploma.DTO.AlumnoDto;
import com.bootcamp.Responsesymetodopostejerciciodiploma.DTO.MateriaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Obtenerdiploma {

    @PostMapping("/obtenerdiploma")
    public String calcularNota(@RequestBody AlumnoDto alumnoDto) {
        //recorrer la lista de notas y calcular el promedio,luego devolver un msj con el resultado
        //forma 1 recorro con for y calculo
        //forma 2  usar Stream

        try {
            double acuNotas = 0.0;
            List<MateriaDto> materiaDtoList = alumnoDto.getMaterias();
            /*for (MateriaDto materiaDto : materiaDtoList) {
                acuNotas = acuNotas + materiaDto.getNota();
            }*/
            for(int i =0; i<materiaDtoList.size(); i++){
                acuNotas = acuNotas + materiaDtoList.get(i).getNota();
            }

            double promedio = acuNotas / alumnoDto.getMaterias().size();
            if(promedio>9) {
                return "Felicitaciones por el gran trabajo";
            }
            return "El promedio es " + promedio;
        } catch (Exception e) {
            return "No hay materias para calcular el promedio";
        }
    }
}


