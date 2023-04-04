package com.demospring.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "asignaturas")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsignatura")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "idStudent")
    private Student student;
}
