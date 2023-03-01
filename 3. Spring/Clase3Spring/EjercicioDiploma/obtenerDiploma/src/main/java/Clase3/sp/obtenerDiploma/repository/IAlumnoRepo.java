package Clase3.sp.obtenerDiploma.repository;

import Clase3.sp.obtenerDiploma.models.Alumno;

import java.util.List;

public interface IAlumnoRepo {
    public List<Alumno> getAlumnos();
    public boolean agregarAlumno(Alumno alumno);
    public boolean eliminarAlumno(Alumno alumno);
}
