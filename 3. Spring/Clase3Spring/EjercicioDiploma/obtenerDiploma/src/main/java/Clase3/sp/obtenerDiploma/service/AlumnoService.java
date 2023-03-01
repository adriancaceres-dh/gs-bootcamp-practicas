package Clase3.sp.obtenerDiploma.service;

import Clase3.sp.obtenerDiploma.dto.AlumnoConPromedioDto;
import Clase3.sp.obtenerDiploma.dto.AlumnoDto;
import Clase3.sp.obtenerDiploma.models.Alumno;
import Clase3.sp.obtenerDiploma.repository.AlumnoRepo;
import Clase3.sp.obtenerDiploma.repository.IAlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService { //lo trabaja el fremmwork al ser un servicio

    @Autowired //inyeccion de dependencia, me permite usar.
    IAlumnoRepo alumnoRepo;

    //falta colocar el try catch con la Exception
    public List<AlumnoConPromedioDto>getAlumnosConPromedio(){  //tiene que tomar dto y devolver un dto.
        List<AlumnoConPromedioDto>alumnosConPromedio=new ArrayList<>();
        Double promedio =0.0;
        for(Alumno alumno: alumnoRepo.getAlumnos()){
            promedio=alumno.getMaterias().stream().mapToDouble(n->n.getNota()).average()
                    .orElseThrow(); //esto es lo mismo que recorrer la lista con el for y acumular las notas, para sacar el promedio
            alumnosConPromedio.add(new AlumnoConPromedioDto(alumno.getNombre(),promedio));
        }
        return alumnosConPromedio;
    }

   // public boolean agregarAlumno(AlumnoDto alumnoDto){}


}
