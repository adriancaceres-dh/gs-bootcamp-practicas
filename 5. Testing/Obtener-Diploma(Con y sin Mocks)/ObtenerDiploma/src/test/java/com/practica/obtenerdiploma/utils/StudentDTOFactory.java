package com.practica.obtenerdiploma.utils;

import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Factory = patron de diseño que crea objetos a partir de las necesidades
//los metodos son siempre estaticos
public class StudentDTOFactory {

    //creamos los datos del JSON, como son manuales se recomienda que la muestra de prueba sea chica
    public static StudentDTO getStudent1(){
        return StudentDTO.builder()
                .id(1L)
                .studentName("Juan")
                .subjects(subjectsStudent1())
                .build();
    }

    public static SubjectDTO getMatematicaStudent1(){
        return SubjectDTO.builder()
                .name("Matemática")
                .score(9.0)
                .build();
    }
    public static SubjectDTO getFisicaStudent1(){
        return SubjectDTO.builder()
                .name("Química")
                .score(7.0)
                .build();
    }
    public static SubjectDTO getQuimicaStudent1(){
        return SubjectDTO.builder()
                .name("Física")
                .score(6.0)
                .build();
    }

    public static List<SubjectDTO> subjectsStudent1(){
        List<SubjectDTO> subjetsStudent1 = new ArrayList<>();
        subjetsStudent1.add(getMatematicaStudent1());
        subjetsStudent1.add(getFisicaStudent1());
        subjetsStudent1.add(getQuimicaStudent1());

        return subjetsStudent1;
    }

    public static StudentDTO getStudent2(){
        return StudentDTO.builder()
                .id(2L)
                .studentName("Pedro")
                .subjects(subjectsStudent2())
                .build();
    }

    public static SubjectDTO getMatematicaStudent2(){
        return SubjectDTO.builder()
                .name("Matemática")
                .score(10.0)
                .build();
    }
    public static SubjectDTO getFisicaStudent2(){
        return SubjectDTO.builder()
                .name("Física")
                .score(8.0)
                .build();
    }
    public static SubjectDTO getQuimicaStudent2(){
        return SubjectDTO.builder()
                .name("Química")
                .score(4.0)
                .build();
    }

    public static List<SubjectDTO> subjectsStudent2(){
        List<SubjectDTO> subjetsStudent2 = new ArrayList<>();
        subjetsStudent2.add(getMatematicaStudent2());
        subjetsStudent2.add(getFisicaStudent2());
        subjetsStudent2.add(getQuimicaStudent2());

        return subjetsStudent2;
    }

    public static Set<StudentDTO> listStudent(){
        Set<StudentDTO> listStudent = new HashSet<>();
        listStudent.add(getStudent1());
        listStudent.add(getStudent2());

        return listStudent;
    }
}
