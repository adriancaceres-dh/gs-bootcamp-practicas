package com.bootcamp.ejercicioNotas.service;

import com.bootcamp.ejercicioNotas.dto.AlumnoConPromedioDto;
import com.bootcamp.ejercicioNotas.models.Alumno;
import com.bootcamp.ejercicioNotas.repository.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepo alumnoRepo;

    public List<AlumnoConPromedioDto> getAlumnosConPromedio() {
        List<AlumnoConPromedioDto> alumnosConPromedio = new ArrayList<>();
        Double promedio = 0.0;
        for (Alumno alumno : alumnoRepo.getAlumnos()) {
            promedio = alumno.getMaterias().stream().mapToDouble(n -> n.getNota()).average()
                    .orElseThrow();
            alumnosConPromedio.add(new AlumnoConPromedioDto(alumno.getNombre(), promedio));
        }
        return alumnosConPromedio;
    }

}
