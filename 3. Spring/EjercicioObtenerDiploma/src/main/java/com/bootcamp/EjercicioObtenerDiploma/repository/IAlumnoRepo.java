package com.bootcamp.EjercicioObtenerDiploma.repository;

import com.bootcamp.EjercicioObtenerDiploma.models.Alumno;

import java.util.List;

public interface IAlumnoRepo {

    public List<Alumno> getAlumnos();
    public boolean agregarAlumno(Alumno alumno);
    public boolean eliminarAlumno(Alumno alumno);

}