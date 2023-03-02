package com.example.Spring.clase2_ObtenerDiploma.service;

import com.example.Spring.clase2_ObtenerDiploma.dto.AlumnoDto;
import com.example.Spring.clase2_ObtenerDiploma.dto.DiplomaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculosImpl implements Calculos{

    public DiplomaDto obtenerCertificado(AlumnoDto alumno){
        DiplomaDto response = new DiplomaDto();
        response.setPromedio(obtenerPromedio(alumno));
        response.setMensaje(mensaje(alumno));

        return response;
    }

    @Override
    public Double obtenerPromedio(AlumnoDto alumno) {
        Double promedio = alumno.getAsignaturasAprobadas().stream()
                .mapToDouble(n->n.getNota()).average().orElseThrow();
        return promedio;
    }

    @Override
    public String mensaje(AlumnoDto alumno) {
        Double promedio = obtenerPromedio(alumno);
        String nombre = alumno.getNombre();
        String mensaje = "Felicitaciones " + nombre + " haz finalizado el curso con éxtito! Su promedio fue de "
                + promedio;

        if(promedio > 9){
            mensaje = "Felicitaciones " + nombre + " te recibiste con honones con un promedio de " + promedio;
        }

        return mensaje;
    }


}
