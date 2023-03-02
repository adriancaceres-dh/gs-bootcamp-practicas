package com.bootcamp.ejercicioNotas.repository;

import com.bootcamp.ejercicioNotas.models.Alumno;
import com.bootcamp.ejercicioNotas.models.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepo {

    List<Alumno> alumnos = new ArrayList<>();

    public AlumnoRepo(){
        // datos de prueba
        alumnos.add(new Alumno("Juan", List.of(new Materia("Matematica", 9.0))));
        alumnos.add(new Alumno("Erik", List.of(new Materia("Fisica", 7.0))));
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
