package com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.controller;

import com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO.DiplomaDTO;
import com.example.clase2_DTOResponseEntity.clase2_EjercicioDiploma.DTO.EstudianteDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerCertificadoController {

    @PostMapping("/alumno/certificado")
    public DiplomaDTO obtenerDiploma(@RequestBody EstudianteDTO estudiante){

        DiplomaDTO diploma = new DiplomaDTO();
        diploma.setPromedio(estudiante.calcularPromedio(estudiante));

        if(diploma.getPromedio() > 9){
            diploma.setMensaje("Felicitaciones!! Te has recibido con honores.");
        }else{
            diploma.setMensaje("Felicitaciones por haber finalizado la carrera.");
        }

        return diploma;


    }


}
