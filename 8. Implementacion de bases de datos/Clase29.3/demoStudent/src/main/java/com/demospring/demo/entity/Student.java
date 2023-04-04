package com.demospring.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estudiantes")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEstudiante")
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "edad")
    private Short edad;

    @Column(name = "email")
    private String email;

    @Column(name = "genero")
    private Character gender;


}
