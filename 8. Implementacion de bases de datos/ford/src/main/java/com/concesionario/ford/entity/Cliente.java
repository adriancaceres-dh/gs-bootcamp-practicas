package com.concesionario.ford.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "entity_clientess")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String nombre;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String telefono;

    @Column(length = 2)
    private Integer edad;

    private LocalDate fechaDeNacimiento;
}
