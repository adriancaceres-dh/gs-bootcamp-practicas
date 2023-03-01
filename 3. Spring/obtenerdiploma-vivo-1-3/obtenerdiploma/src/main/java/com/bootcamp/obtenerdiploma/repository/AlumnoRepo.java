package com.bootcamp.obtenerdiploma.repository;

import com.bootcamp.obtenerdiploma.models.Alumno;
import com.bootcamp.obtenerdiploma.models.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepo implements IAlumnoRepo{
    List<Alumno> alumnos = new ArrayList<>();
    public AlumnoRepo() {
        // datos de prueba
        // Prueba 1
        alumnos.add(new Alumno("Juan",List.of(new Materia("Matematica",9.0))));
        alumnos.add(new Alumno("Erik",List.of(new Materia("Fisica",7.0),
                                                     new Materia("Geometria", 10.0) )));
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public boolean agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        return true;
    }

    @Override
    public boolean eliminarAlumno(Alumno alumno) {
        // implementar
        return false;
    }
}
