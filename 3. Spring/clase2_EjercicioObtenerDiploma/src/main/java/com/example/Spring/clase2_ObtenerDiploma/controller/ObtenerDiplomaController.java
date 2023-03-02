package com.example.Spring.clase2_ObtenerDiploma.controller;

import com.example.Spring.clase2_ObtenerDiploma.dto.AlumnoDto;
import com.example.Spring.clase2_ObtenerDiploma.dto.DiplomaDto;
import com.example.Spring.clase2_ObtenerDiploma.service.Calculos;
import com.example.Spring.clase2_ObtenerDiploma.service.CalculosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObtenerDiplomaController {

    Calculos calculos = new CalculosImpl();

    @PostMapping("/obtenerCertificado")
    public DiplomaDto certificado(@RequestBody AlumnoDto alumno){
        return calculos.obtenerCertificado(alumno);
    }

}
