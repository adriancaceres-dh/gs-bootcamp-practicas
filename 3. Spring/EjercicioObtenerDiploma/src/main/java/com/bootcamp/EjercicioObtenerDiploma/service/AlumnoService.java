package com.bootcamp.EjercicioObtenerDiploma.service;

import com.bootcamp.EjercicioObtenerDiploma.dto.AlumnoDto;
import com.bootcamp.EjercicioObtenerDiploma.dto.AlumnoPromedioDto;
import com.bootcamp.EjercicioObtenerDiploma.dto.MateriaDto;
import com.bootcamp.EjercicioObtenerDiploma.excepciones.AlumnoException;
import com.bootcamp.EjercicioObtenerDiploma.models.Alumno;
import com.bootcamp.EjercicioObtenerDiploma.models.Materia;
import com.bootcamp.EjercicioObtenerDiploma.repository.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepo alumnoRepo;


    public List<AlumnoPromedioDto> getAlumnosConPromedio() {
        List<AlumnoPromedioDto> alumnosConPromedio = new ArrayList<>();
        try {
            Double promedio = 0.0;
            Double acu = 0.0;
            for (Alumno alumno : alumnoRepo.getAlumnos()) {
                // promedio = alumno.getMaterias().stream().mapToDouble(n -> n.getNota()).average().orElseThrow();
                acu = 0.0;
                for (Materia materia : alumno.getMaterias()) {
                    acu = acu + materia.getNota();
                }
                promedio = acu / alumno.getMaterias().size();
                alumnosConPromedio.add(new AlumnoPromedioDto(alumno.getNombre(), promedio));
            }
            return alumnosConPromedio;
        } catch (Exception e ) {
            throw new AlumnoException("No hay materias para calcular el promedio");
        }
    }

    public String agregarAlumno(AlumnoDto alumnoDto) {
        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoDto.getNombre());
        List<Materia> materias = new ArrayList<>();
        for (MateriaDto materiaDto : alumnoDto.getMaterias()) {
            materias.add(new Materia(materiaDto.getNombre(),materiaDto.getNota()));
        }
        alumno.setMaterias(materias);
        System.out.println(alumno);
        alumnoRepo.agregarAlumno(alumno);
        return "Alta ok";
    }

}
