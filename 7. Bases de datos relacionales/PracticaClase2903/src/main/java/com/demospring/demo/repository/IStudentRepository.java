package com.demospring.demo.repository;

import com.demospring.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IStudentRepository extends JpaRepository<Student, Integer> {
// 1. listar todos los estudiantes en orden alfabetico.
    @Query("FROM student orderby ASC")
    List<Student> MEFALTAELMETODOACAAAA (@Param("name")String name);
//2. listar todos los estudiantesque tengan entre 20 y 30, o dos años pasados por postman
//3. listar todos los estudiantes que al menos tengan 1 asignatura asociada
//4. listar las asignaturas que tengan un alumno en especifico.
//5. obtener el id del estudiante y la cantidad de asignaturas a su nombre
//6. obtener el id, el nombre, la numero de tarjeta y la cantidad de facturas a su nombre segun un año pasado por argumento. (ESTA NO SE COMO REFORMULARLA)
}
