package com.bootcamp.obtenerDiploma.Services;

import com.bootcamp.obtenerDiploma.Dto.AlumnoConPromedioDto;
import com.bootcamp.obtenerDiploma.Exceptions.AlumnoException;
import com.bootcamp.obtenerDiploma.Models.Alumno;
import com.bootcamp.obtenerDiploma.Repository.AlumnoRepo;
import com.bootcamp.obtenerDiploma.Repository.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepo alumnoRepo;

    public List<AlumnoConPromedioDto> getAlumnosConPromedio() {
        List<AlumnoConPromedioDto> AlumnosConPromedio = new ArrayList<>();
        try {
            Double promedio = 0.0;
            for (Alumno alumno : alumnoRepo.getAlumnos()) {
                promedio = alumno.getMaterias().stream().mapToDouble(n -> n.getNota()).average().orElseThrow();
                AlumnosConPromedio.add(new AlumnoConPromedioDto(alumno.getNombre(), promedio));

            }
            return AlumnosConPromedio;
        } catch (Exception e) {
            throw new AlumnoException("No hay materias para calcular el promedio");
        }
    }
}