package com.bootcamp.obtenerdiploma.repository;

import com.bootcamp.obtenerdiploma.models.Alumno;

import java.util.List;

public interface IAlumnoRepo {

    public List<Alumno> getAlumnos();
    public boolean agregarAlumno(Alumno alumno);
    public boolean eliminarAlumno(Alumno alumno);

}
