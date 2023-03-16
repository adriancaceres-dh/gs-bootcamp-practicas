package com.bootcamp.DTOResponseEntity.controller;

import com.bootcamp.DTOResponseEntity.Alumno;
import com.bootcamp.DTOResponseEntity.Diploma;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
    @PostMapping("/alumnos")
    public String generarDiploma(@RequestBody Alumno alumno) {
        return Diploma.generarMensaje(alumno);
    }

}
