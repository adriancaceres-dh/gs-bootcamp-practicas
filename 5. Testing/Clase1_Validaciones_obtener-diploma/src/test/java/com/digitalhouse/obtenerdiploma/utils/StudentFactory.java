package com.digitalhouse.obtenerdiploma.utils;

import com.digitalhouse.obtenerdiploma.dto.StudentDTO;
import com.digitalhouse.obtenerdiploma.dto.SubjectDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {

    public static StudentDTO getStudent(){
        List<SubjectDTO> subjets = new ArrayList<>();
        subjets.add(getSubjectMatematica());
        subjets.add(getSubjectQuimica());

        StudentDTO student = new StudentDTO("Lucho",subjets);

        return student;
    }

    public static StudentDTO getStudentWithAverage(){
        List<SubjectDTO> subjets = new ArrayList<>();
        subjets.add(getSubjectMatematica());
        subjets.add(getSubjectQuimicaWithAverage());

        StudentDTO student = new StudentDTO("Lucas",subjets);

        return student;
    }

    public static StudentDTO getStudentException(){
        List<SubjectDTO> subjets = new ArrayList<>();
        subjets.add(getSubjectMatematica());

        StudentDTO student = new StudentDTO("Lucas",subjets);

        return student;
    }

    public static SubjectDTO getSubjectMatematica(){
        SubjectDTO matematicas = new SubjectDTO("Matemarticas",10);
        return matematicas;
    }

    public static SubjectDTO getSubjectQuimica(){
        SubjectDTO quimica = new SubjectDTO("Química",8);
        return quimica;
    }

    public static SubjectDTO getSubjectQuimicaWithAverage(){
        SubjectDTO quimica = new SubjectDTO("Química",9);
        return quimica;
    }

}
