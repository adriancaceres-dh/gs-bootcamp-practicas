package Clase3.sp.obtenerDiploma.repository;


import Clase3.sp.obtenerDiploma.models.Alumno;
import Clase3.sp.obtenerDiploma.models.Materia;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlumnoRepo implements IAlumnoRepo{

    List<Alumno>alumnos=new ArrayList<>();


    //construtor
    private AlumnoRepo(){
        //datos de prueba
        //Prueba 1
        /*
        alumnos.add(new Alumno("Julian",List.of(new Materia("Matematica",9.0)))); //El list.of hace una lista de lo que pidamos.
        alumnos.add(new Alumno("Ricardo",List.of(new Materia("Fisica",7.0),
                                                        new Materia("Geometria",6.0)))); */

        //Prueba 2
        alumnos.add(new Alumno("Julian",new ArrayList<>())); //en este caso no tiene notas.


    }
    public List<Alumno>getAlumnos(){
        return alumnos;
    }

    @Override
    public boolean agregarAlumno(Alumno alumno) {
        //implementar
        return false;
    }

    @Override
    public boolean eliminarAlumno(Alumno alumno) {
        //implementar
        return false;
    }

}
