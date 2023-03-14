package com.bootcamp.obtenerDiploma.Repository;

import com.bootcamp.obtenerDiploma.Models.Alumno;

import java.util.List;

public interface IAlumnoRepo {

    public List<Alumno> getAlumnos();
    public boolean agregarAlumno(Alumno alumno);
    public boolean eliminar(Alumno alumno);




}
