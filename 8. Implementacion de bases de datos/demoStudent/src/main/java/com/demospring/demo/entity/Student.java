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
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "edad")
    private Short edad;

    @Column(length = 100)
    private String email;

    @Column
    private Character gender;

     @OneToMany(mappedBy = "student")
     private List<Assignment> assignment;
}
