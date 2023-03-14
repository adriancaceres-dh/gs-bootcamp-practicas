package com.diploma.diplomaAlumnos.repository;
import com.diploma.diplomaAlumnos.models.Alumno;
import com.diploma.diplomaAlumnos.models.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepo {
    List<Alumno> alumnos = new ArrayList<>();

    public AlumnoRepo(){
        // Constructor con datos de prueba
        alumnos.add(new Alumno("Juan", List.of(
                new Materia("Matematica", 7.0),
                new Materia("Lengua", 3.0),
                new Materia("Fisica", 9.0),
                new Materia("Ingles", 10.0))));
        alumnos.add(new Alumno("Enrique",  List.of(
                new Materia("Matematica", 1.0),
                new Materia("Lengua", 9.0),
                new Materia("Fisica", 6.0),
                new Materia("Ingles", 10.0))));
        alumnos.add(new Alumno("Leana", List.of(
                new Materia("Matematica", 10.0),
                new Materia("Lengua", 10.0),
                new Materia("Fisica", 10.0),
                new Materia("Ingles", 10.0))));
        alumnos.add(new Alumno("Pedro", List.of(
                new Materia("Matematica", 3.0),
                new Materia("Lengua", 5.0),
                new Materia("Fisica", 2.0),
                new Materia("Ingles", 5.0))));
    }
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
