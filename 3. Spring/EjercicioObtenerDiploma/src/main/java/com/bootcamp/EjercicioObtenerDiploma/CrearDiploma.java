package com.bootcamp.EjercicioObtenerDiploma;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CrearDiploma {

    @GetMapping("/diploma")

    public Alumno diploma() {


        List<Asignatura> asignaturas = new ArrayList<>();

        Asignatura asignatura1 = new Asignatura("Mat", 9.00);
        Asignatura asignatura2 = new Asignatura("Ingles", 7.00);


        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);

        Alumno alumno = new Alumno("Franco", asignaturas);
        return alumno;

    }


}
