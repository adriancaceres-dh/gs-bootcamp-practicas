package com.example.Spring.clase2_ObtenerDiploma.service;

import com.example.Spring.clase2_ObtenerDiploma.dto.AlumnoDto;
import com.example.Spring.clase2_ObtenerDiploma.dto.DiplomaDto;
import org.springframework.stereotype.Service;

@Service
public interface Calculos {
    public Double obtenerPromedio(AlumnoDto alumno);
    public String mensaje(AlumnoDto alumno);

    public DiplomaDto obtenerCertificado(AlumnoDto alumno);
}
