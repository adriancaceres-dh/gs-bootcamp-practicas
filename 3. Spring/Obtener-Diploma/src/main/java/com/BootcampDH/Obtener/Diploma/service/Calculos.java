package com.BootcampDH.Obtener.Diploma.service;

import com.BootcampDH.Obtener.Diploma.dto.AlumnoDto;
import com.BootcampDH.Obtener.Diploma.dto.DiplomaDto;
import org.springframework.stereotype.Service;

@Service
public class Calculos {

    //metodo para calcular promedio--> recibe como parametro un alumno
    //del alumno obtenemos la lista de materias aprobadas, de ahi las notas de cada materia, la convertimos en una lista de notas
    //calculamos el promedio
    public Double promedio(AlumnoDto alumno){
        Double promedio = alumno.getMateriasAprobadas().stream()
                .mapToDouble(n->n.getNota()).average().orElse(0.00);

        return promedio;
    }

    //metodo para mensaje
    public String mensaje(AlumnoDto alumno){
        Double promedio = promedio(alumno);
        System.out.println(alumno);
        String nombre = alumno.getNombre();
        String mensaje = "Felicitaciones " + nombre + " has finalizado tu curso con un promedio de " + promedio;

        if(promedio > 9){
            mensaje = "Ademas queremos agregar que por tu promedio estás dentro de nuestro cuadro de honor";
        }

        return mensaje;
    }

    //metodo para emitir el certificado --> nos va a devolver un DiplomaDto, recibiendo como parametro un alumno
    public DiplomaDto emitirCertificado (AlumnoDto alumno){

        DiplomaDto diploma = new DiplomaDto(); //instanciamos la clase p/ poder usarla
        diploma.setPromedio(promedio(alumno)); //seteamos el promedio con el metodo promedio
        diploma.setMensaje(mensaje(alumno)); //seteamos el mensaje con el metodo mensaje

        return diploma;
    }
}
