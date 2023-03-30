package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String nombre;

    @Column(length = 50)
    private String apellido;

    @Column(length = 2)
    private Short edad;

    @Column(length = 10)
    private Integer documento;

    @ManyToOne //Paciente domina relación
    private Tutor tutor;

    @ManyToOne() //Paciente domina relación
    private Doctor doctor;

}
