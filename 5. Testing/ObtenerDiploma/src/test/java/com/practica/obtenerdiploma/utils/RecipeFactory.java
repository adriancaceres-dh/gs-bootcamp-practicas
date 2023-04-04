package com.practica.obtenerdiploma.utils;



import com.practica.obtenerdiploma.model.StudentDTO;
import com.practica.obtenerdiploma.model.SubjectDTO;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecipeFactory {

    public static StudentDTO getStudent(){
        return StudentDTO.builder().id(1L).studentName("Juan").build();
    }

    public static StudentDTO getNotStudent(){
        return StudentDTO.builder().id(3L).studentName("Lucio").build();
    }

    public static StudentDTO getStudentSearch(){
        StudentDTO student = StudentDTO.builder().id(2L).studentName("Pedro").build();
        List<SubjectDTO> lista = new ArrayList<>();
        lista.add(RecipeFactory.getSubject());
        lista.add(RecipeFactory.getSubject1());
        lista.add(RecipeFactory.getSubject2());
        student.setSubjects(lista);
        return student;
    }
    public static SubjectDTO getSubject(){
        return SubjectDTO.builder().name("Matemática").score(10.00).build();
    }
    public static SubjectDTO getSubject1(){
        return SubjectDTO.builder().name("Física").score(8.00).build();
    }
    public static SubjectDTO getSubject2(){
        return SubjectDTO.builder().name("Química").score(4.00).build();
    }

    public static StudentDTO getStudentSearch2(){
        StudentDTO student = RecipeFactory.getStudent();
        List<SubjectDTO> lista = new ArrayList<>();
        lista.add(RecipeFactory.get1Subject());
        lista.add(RecipeFactory.get1Subject1());
        lista.add(RecipeFactory.get1Subject2());
        student.setSubjects(lista);
        return student;
    }


    public static SubjectDTO get1Subject(){
        return SubjectDTO.builder().name("Matemática").score(9.00).build();
    }
    public static SubjectDTO get1Subject1(){
        return SubjectDTO.builder().name("Física").score(7.00).build();
    }
    public static SubjectDTO get1Subject2(){
        return SubjectDTO.builder().name("Química").score(6.00).build();
    }

    public static Set<StudentDTO> AllStudent(){

        Set<StudentDTO> loadedData = new HashSet<>();

        StudentDTO student = getStudentSearch();

        StudentDTO student1 = getStudentSearch2();

        loadedData.add(student);

        loadedData.add(student1);


        return loadedData;

    }

    public static StudentDTO analisisScore(){
        StudentDTO student = getStudentSearch();

        student.setAverageScore((10.00+8.00+4.00)/3);
        student.setMessage("El alumno " + student.getStudentName() + " ha obtenido un promedio de " + new DecimalFormat("#.##").format(student.getAverageScore())
                + ((student.getAverageScore() > 9) ? ". Felicitaciones!" : ". Puedes mejorar."));
        return student;
    }






}
