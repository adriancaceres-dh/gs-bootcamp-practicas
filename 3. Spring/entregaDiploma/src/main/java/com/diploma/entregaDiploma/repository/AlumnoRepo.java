package com.diploma.entregaDiploma.repository;

import com.diploma.entregaDiploma.models.Alumno;
import com.diploma.entregaDiploma.models.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepo {
    List<Alumno>alumnos = new ArrayList<>();
    public AlumnoRepo(){
        alumnos.add(new Alumno("Juan",List.of()));
        alumnos.add(new Alumno("Juan",List.of()));
    }
}
