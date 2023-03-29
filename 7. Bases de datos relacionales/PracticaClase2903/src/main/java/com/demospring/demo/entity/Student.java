package com.demospring.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estudiante")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_alumno",nullable = false,length = 50)
    private String name;

    @Column(nullable = false,scale = 2)
    private Short edad;

    @Column(length = 255)
    private String email;

    @Column(name = "genero",length = 10)
    private Character gender;
}
