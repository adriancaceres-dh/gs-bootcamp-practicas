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
@Table(name = "estudiante")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 20)
    private String name;

    @Column(name = "edad", nullable = false, scale = 2)
    private Short edad;

    @Column(length = 100)
    private String email;

    @Column(name = "genero")
    private Character gender;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Assignment> assignments;
}
