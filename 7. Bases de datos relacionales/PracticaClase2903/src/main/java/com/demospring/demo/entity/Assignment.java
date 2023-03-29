package com.demospring.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "asignatura")
public class Assignment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_asignatura",length = 50, nullable = false)
    private String name;

    @Column(name = "docente_asignatura",length = 50, nullable = false)
    private String teacher;

    @ManyToMany
    private List<Student>students;
}
