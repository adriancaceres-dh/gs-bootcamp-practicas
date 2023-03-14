package com.diploma.diplomaAlumnos.service;

import com.diploma.diplomaAlumnos.dto.AlumnoConPromedioDto;
import com.diploma.diplomaAlumnos.models.Alumno;
import com.diploma.diplomaAlumnos.repository.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {
    @Autowired //Inyeccion de dependencias.
    AlumnoRepo alumnoRepo;
    public List<AlumnoConPromedioDto> getAlumnosConPromedio(){
        List<AlumnoConPromedioDto> getAlumnosConPromedio = new ArrayList<>();
        Double promedio = 0.0;
        for(Alumno alumno: alumnoRepo.getAlumnos()){
             promedio = alumno.getMaterias().stream().mapToDouble(n -> n.getNota()).average().orElseThrow();
            getAlumnosConPromedio.add(new AlumnoConPromedioDto(alumno.getNombre(),promedio));
        }
        return getAlumnosConPromedio;
    }
}
