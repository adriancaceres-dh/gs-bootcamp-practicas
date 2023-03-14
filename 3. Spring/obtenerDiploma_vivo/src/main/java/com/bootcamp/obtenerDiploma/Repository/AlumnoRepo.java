package com.bootcamp.obtenerDiploma.Repository;

import com.bootcamp.obtenerDiploma.Models.Alumno;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepo {

    List<Alumno> alumnos = new ArrayList<>();

    public AlumnoRepo() {
        alumnos.add(new Alumno("Martín", List.of(new Materia("Matematica", 9.0))));
        alumnos.add(new Alumno("Erik", List.of(
                        new Materia("Física", 7.0),
                        new Materia("Geometría", 6.5))));
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public boolean agregarAlumno(Alumno alumno){
        alumnos.add()
    }

}
