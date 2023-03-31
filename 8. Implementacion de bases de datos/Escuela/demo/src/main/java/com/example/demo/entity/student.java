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
@Table(name = "estudiante")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre_alumno",length = 60 )
    private String nameStudent;

    @Column (name="Curso",length =2)
    private short grade;

    @Column (name="nota")
    private short qualification;
}
