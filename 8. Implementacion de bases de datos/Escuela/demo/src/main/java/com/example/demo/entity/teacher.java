package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
// JPA

@Entity
@Table(name = "docente")
public class teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre_docente",length = 60 )
    private String nameTeacher;

    @Column (name="Asignatura")
    private short assignament;
}
